package com.example.greenfuture;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class DefineTripController {
    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox vehicles;

    @FXML
    private ObservableList<String> vehicleList = FXCollections.observableArrayList(
            "Benzine auto", "Hybride auto", "Diesel auto", "Elektrische auto", "Fiets", "Bus"
    );

    private void initialize() {
        vehicles.setItems(vehicleList);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        initialize();
    }
}