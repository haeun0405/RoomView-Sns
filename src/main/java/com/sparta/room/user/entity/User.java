package com.sparta.room.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
@Entity
@Getter
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="email" ,nullable = false)
    private String email;
    @Column(name="username" ,nullable = false)
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="introduce")
    private String introduce;


}
