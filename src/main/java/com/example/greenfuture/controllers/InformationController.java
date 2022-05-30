package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class InformationController extends Controller {

    public Button backBtn;
    public TextArea informationTextArea;
    public Button logoutBtn;

    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
