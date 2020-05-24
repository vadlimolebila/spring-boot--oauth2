package com.molebila.oauth2.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Nurvadli
 * @created 10/05/2020 - 10꞉58 AM
 */
@Data
@Entity
@Table(name="tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username", length = 100)
    private String username;

    @JsonIgnore
    @Column(name = "password", length = 100)
    private String password;

    @Column
    private long salary;

    @Column
    private int age;

}
