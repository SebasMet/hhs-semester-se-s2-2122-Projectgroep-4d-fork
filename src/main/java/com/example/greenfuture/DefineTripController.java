package com.example.greenfuture;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DefineTripController implements Initializable {

    @FXML
    private Button confirmBtn;

    @FXML
    private ComboBox vehicles;

    @FXML
    private TextField kms;

    @FXML
    private final ObservableList<String> vehicleList = FXCollections.observableArrayList(
            "Benzine auto", "Hybride auto", "Diesel auto", "Elektrische auto", "Fiets", "Bus"
    );

    @FXML
    private void confirmTrip() {
        // controleer of alles is ingevuld
        if (kms.getCharacters().isEmpty()) return;
        if (vehicles.getSelectionModel().isEmpty()) return;

        // maak nieuw variable met correcte data
        Trip trip = new Trip(String.valueOf(vehicles.getSelectionModel().getSelectedItem()), Integer.parseInt(kms.getCharacters().toString()), "henk");
        System.out.println(trip.getVehicle() + " - " + trip.getDistance() + " - " + trip.getUser());

        // sla data ergens op
    }

    private void calculatePoints() {

    }

    private void saveTripData() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vehicles.setItems(vehicleList);
    }
}