package com.example.example2;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String login;
    private String password;
    private String firstname;

    public User(String login, String password, String firstname) {
        this.login = login;
        this.password = password;
        this.firstname = firstname;
    }
}
