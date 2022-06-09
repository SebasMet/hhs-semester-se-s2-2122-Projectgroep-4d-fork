package com.example.greenfuture.controllers;

public class User { //Benzine auto", "Hybride auto", "Diesel auto", "Elektrische auto", "Fiets", "Bus"
    private String password;
    private boolean isAdmin;
    private boolean LoggedIn = false;
    private int totalPoints;
    private int gasolineCarPoints;
    private int hybrideAutoPoints;
    private int dieselAutoPoints;
    private int electricAutoPoints;
    private int bicyclePoints;
    private int busPoints;


    public int getGasolineCarPoints() {
        return gasolineCarPoints;
    }

    public void setGasolineCarPoints(int gasolineCarPoints) {
        this.gasolineCarPoints = gasolineCarPoints;
    }

    public int getHybrideAutoPoints() {
        return hybrideAutoPoints;
    }

    public void setHybrideAutoPoints(int hybrideAutoPoints) {
        this.hybrideAutoPoints = hybrideAutoPoints;
    }

    public int getDieselAutoPoints() {
        return dieselAutoPoints;
    }

    public void setDieselAutoPoints(int dieselAutoPoints) {
        this.dieselAutoPoints = dieselAutoPoints;
    }

    public int getElectricAutoPoints() {
        return electricAutoPoints;
    }

    public void setElectricAutoPoints(int electricAutoPoints) {
        this.electricAutoPoints = electricAutoPoints;
    }

    public int getBicyclePoints() {
        return bicyclePoints;
    }

    public void setBicyclePoints(int bicyclePoints) {
        this.bicyclePoints = bicyclePoints;
    }

    public int getBusPoints() {
        return busPoints;
    }

    public void setBusPoints(int busPoints) {
        this.busPoints = busPoints;
    }

    public User(String password, boolean isAdmin) {
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public int getPoints() {
        return totalPoints;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setLoggedIn(boolean loggedIn) {
        LoggedIn = loggedIn;
    }

    public boolean isLoggedIn2() {
        return LoggedIn;
    }
}
