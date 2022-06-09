package com.example.greenfuture;

public class Trip {

    private String vehicle;
    private int distance;
    private String user;

    public Trip(String vehicle, int distance, String user) {
        this.vehicle = vehicle;
        this.distance = distance;
        this.user = user;
    }

    public String getVehicle() {
        return vehicle;
    }

    public int getDistance() {
        return distance;
    }

    public String getUser() {
        return user;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
