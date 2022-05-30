package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class DashboardController extends Controller {
    @FXML
    private Button logout;
    @FXML
    private Label welcomeLabel;
    @FXML
    private Button progressBtn;
    @FXML
    private Button informationBtn;
    @FXML
    private Button defineTripBtn;
    @FXML
    private Button scoreboardBtn;
    @FXML
    private Button challengesBtn;
    @FXML
    private Button accountBtn;

    @FXML
    private void goToProgress() throws IOException {
        changeScene("progress", "Persoonlijke progressie");
    }

    @FXML
    private void goToInformation() throws IOException {
        changeScene("information", "Informatie over dit programma");
    }

    @FXML
    private void goToDefineTrip() throws IOException {
        changeScene("defineTrip", "Invullen gereisde trip");
    }

    @FXML
    private void goToScoreboard() throws IOException {
        changeScene("scoreboard", "Scorebord");
    }

    @FXML
    private void goToChallenges() throws IOException {
        changeScene("challenges", "Uitdagingen");
    }

    @FXML
    private void goToAccount() throws IOException {
        changeScene("account", "Jouw account");
    }
}
