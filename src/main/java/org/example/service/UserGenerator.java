package org.example.service;

import org.example.model.User;

import static org.example.constants.DataForLoginUser.LOGIN;
import static org.example.constants.DataForLoginUser.PASSWORD;

public class UserGenerator {
    public User getValidUser() {
        return User.builder()
                .login(LOGIN)
                .password(PASSWORD)
                .build();
    }
}
