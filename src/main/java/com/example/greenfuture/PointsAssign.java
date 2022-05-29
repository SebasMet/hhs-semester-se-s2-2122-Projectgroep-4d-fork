package com.example.greenfuture;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PointsAssign implements Initializable {
    private String vehicle;
    private double points;

    public ArrayList<PointsAssign> pointsAssigns = new ArrayList<>();

    public  PointsAssign(String vehicle, double points){
        this.vehicle = vehicle;
        this.points = points;
    }
    
    public double getPoints() {
        return points;
    }

    public double calcPoints(PointsAssign Pick, int km){
        return Pick.getPoints() * km;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pointsAssigns.add(new PointsAssign("Bus", 5.4));
        pointsAssigns.add(new PointsAssign("Auto(bezine)", 16.4));
        pointsAssigns.add(new PointsAssign("Auto(diesel)", 16.7));
        pointsAssigns.add(new PointsAssign("Auto(hybride)", 11.7));
        pointsAssigns.add(new PointsAssign("Auto(elektrish)", 6.9));
        pointsAssigns.add(new PointsAssign("Trein", 2.6));
        pointsAssigns.add(new PointsAssign("vliegtuig", 30));
        pointsAssigns.add(new PointsAssign("Fiets(elekitrish)", 0.9));
        pointsAssigns.add(new PointsAssign("Fiets", 0));
    }
}
