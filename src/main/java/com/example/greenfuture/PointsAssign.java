package com.example.greenfuture;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

public class PointsAssign {

    private final HashMap<String, Integer> transportValue = new HashMap<>();

    public int calcPoints(Trip trip){
        initialize();
        return transportValue.get(trip.getVehicle()) * trip.getDistance();
    }

    public void initialize() {
        transportValue.put("Benzine auto", 18);
        transportValue.put("Diesel auto", 20);
        transportValue.put("Hybride auto", 12);
        transportValue.put("Elektrische auto", 3);
        transportValue.put("Bus", 7);
        transportValue.put("Fiets", 0);
    }
}
