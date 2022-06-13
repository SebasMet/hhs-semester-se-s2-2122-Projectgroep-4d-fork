package com.example.greenfuture.controllers;

public class User { //Benzine auto", "Hybride auto", "Diesel auto", "Elektrische auto", "Fiets", "Bus"
    private String password;
    private boolean isAdmin;
    private boolean LoggedIn = false;
    private int totalPoints;
    private double gasolineCarPoints;
    private double hybrideAutoPoints;
    private double dieselAutoPoints;
    private double electricAutoPoints;
    private double bicyclePoints;
    private double busPoints;

    //Gasoline


    public double getGasolineCarPoints() {
        return gasolineCarPoints;
    }

    public void addGasolineCarPoints(int gasolineCarPoints) {
        this.gasolineCarPoints += gasolineCarPoints;
    }

    //Hybride

    public double getHybrideAutoPoints() {
        return hybrideAutoPoints;
    }

    public void addHybrideAutoPoints(int hybrideAutoPoints) {
        this.hybrideAutoPoints += hybrideAutoPoints;
    }

    //Disel

    public double getDieselAutoPoints() {
        return dieselAutoPoints;
    }

    public void addDieselAutoPoints(int dieselAutoPoints) {
        this.dieselAutoPoints = dieselAutoPoints;
    }

    //ElectricAuto

    public double getElectricAutoPoints() {
        return electricAutoPoints;
    }

    public void addElectricAutoPoints(int electricAutoPoints) {
        this.electricAutoPoints += electricAutoPoints;
    }

    //Bicycle

    public double getBicyclePoints() {
        return bicyclePoints;
    }

    public void addBicyclePoints(int bicyclePoints) {
        this.bicyclePoints += bicyclePoints;
    }

    //Bus

    public double getBusPoints() {
        return busPoints;
    }

    public void addBusPoints(int busPoints) {
        this.busPoints += busPoints;
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

    public void setNewPassword(String password) {
        this.password = password;
    }
}
