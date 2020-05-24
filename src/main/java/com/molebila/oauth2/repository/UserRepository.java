package com.molebila.oauth2.repository;

import com.molebila.oauth2.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nurvadli
 * @created 10/05/2020 - 11꞉19 AM
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
