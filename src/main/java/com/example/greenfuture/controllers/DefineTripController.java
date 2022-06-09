package com.example.greenfuture.controllers;

import com.example.greenfuture.PointsAssign;
import com.example.greenfuture.Trip;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class DefineTripController extends Controller {

    @FXML
    public ComboBox<String> vehicleField;
    @FXML
    public TextField distanceField;
    @FXML
    private Button confirmBtn;

    private final HashMap<String, Integer> transportValue = new HashMap<>();

    private final ObservableList<String> vehicleList = FXCollections.observableArrayList(
            "Benzine auto", "Hybride auto", "Diesel auto", "Elektrische auto", "Fiets", "Bus"
    );

    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }

    @FXML
    private void confirmTrip() {
        // controleer of alles is ingevuld
        if (distanceField.getCharacters().isEmpty()) return;
        if (vehicleField.getSelectionModel().isEmpty()) return;

        calculatePoints(Integer.parseInt(distanceField.getText()), vehicleField.getSelectionModel().getSelectedItem());

    }

    private void calculatePoints(int distance, String vehicle) {
        saveTripData(distance * transportValue.get(vehicle));
    }

    private void saveTripData(int points) {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.addPoints(userRepository.getLoggedInUser(), points);
        System.out.println(userRepository.getPoints(userRepository.getLoggedInUser()));

    }

    public void initialize() {
        transportValue.put("Benzine auto", 18);
        transportValue.put("Diesel auto", 20);
        transportValue.put("Hybride auto", 12);
        transportValue.put("Elektrische auto", 3);
        transportValue.put("Bus", 7);
        transportValue.put("Fiets", 0);
        //vehicleField.getItems().addAll(vehicleList);
        vehicleField.setItems(vehicleList);
    }
}