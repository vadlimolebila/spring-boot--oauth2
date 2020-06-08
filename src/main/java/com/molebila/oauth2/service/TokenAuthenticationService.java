package com.molebila.oauth2.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Nurvadli
 * @created 25/05/2020 - 8꞉54 PM
 */
public interface TokenAuthenticationService {

    void addAuthentication(HttpServletResponse response, String username);

    Authentication getAuthentication(HttpServletRequest request);

}
