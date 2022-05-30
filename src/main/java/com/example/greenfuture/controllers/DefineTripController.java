package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DefineTripController extends Controller {

    public Button backBtn;
    public TextField distanceField;
    public ComboBox vehicleField;
    public Button confirmBtn;
    public Button logoutBtn;

    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
