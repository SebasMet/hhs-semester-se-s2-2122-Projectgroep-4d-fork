package com.example.greenfuture.controllers;

public class User {
    private String password;
    private boolean isAdmin;

    public User(String password, boolean isAdmin) {
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
