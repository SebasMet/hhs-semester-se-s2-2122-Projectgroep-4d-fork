package com.example.greenfuture;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DefineTripController implements Initializable {

    @FXML
    private ComboBox vehicles;

    @FXML
    private ObservableList<String> vehicleList = FXCollections.observableArrayList(
            "Benzine auto", "Hybride auto", "Diesel auto", "Elektrische auto", "Fiets", "Bus"
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vehicles.setItems(vehicleList);
    }
}