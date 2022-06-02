package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ProgressController extends Controller {

    public Label todayLabel;
    public Label monthLabel;
    public Label yearLabel;
    public Label wonChallengesLabel;
    public Label pointsLabel;
    public Label weekLabel;
    public Button backBtn;
    public Button logoutBtn;

    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
