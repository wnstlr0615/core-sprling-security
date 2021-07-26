package com.example.corespringsecurity.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import  javax.persistence.Id;

@Entity
@Data
public class Account {
    @Id @GeneratedValue
    private Long Id;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
    private String age;
    private String role;
}
