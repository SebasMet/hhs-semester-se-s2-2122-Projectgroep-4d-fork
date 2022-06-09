package com.example.greenfuture.controllers;

public class User {
    private String password;
    private boolean isAdmin;
    private int points;

    public User(String password, boolean isAdmin) {
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public void addPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
