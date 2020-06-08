package com.molebila.oauth2.service.impl;

import com.molebila.oauth2.domain.AuthenticatedUser;
import com.molebila.oauth2.service.TokenAuthenticationService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author Nurvadli
 * @created 25/05/2020 - 8꞉56 PM
 */
public class TokenAuthenticationServiceImpl implements TokenAuthenticationService {
    /**
     * EXPIRATIO_TIME in 10 Days
     */
    private static final long EXPIRATION_TIME = 1000 * 60 * 60 * 24 * 10;

    private static final String SECRET = "thisIsSecret";
    private static final String TOKEN_PREFIX = "Bearer";
    private static final String HEADER_STRING = "Authorization";

    /**
     * Generate token
     * @param response
     * @param username
     */
    @Override
    public void addAuthentication(HttpServletResponse response, String username) {
        String JWT = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
    }

    /**
     * Parsing token and
     * managed to retrieve a user
     * @param request
     * @return
     */
    @Override
    public Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(HEADER_STRING);
        if(null != token ){
            String username = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
            if(null != username){
                return new AuthenticatedUser(username);
            }
        }
        return null;
    }
}
