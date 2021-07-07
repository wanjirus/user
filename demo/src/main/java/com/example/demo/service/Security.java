package com.example.demo.service;

public interface Security{
    default String findLoggedInUsername() {
        return null;
    }

    void autoLogin(String username, String password);
}