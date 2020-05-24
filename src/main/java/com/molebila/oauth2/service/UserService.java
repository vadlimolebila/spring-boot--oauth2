package com.molebila.oauth2.service;

import com.molebila.oauth2.domain.User;

import java.util.List;

/**
 * @author Nurvadli
 * @created 10/05/2020 - 11꞉21 AM
 */
public interface UserService {

    User save (User user);

    List<User> findAll();

    void delete(long id);

}
