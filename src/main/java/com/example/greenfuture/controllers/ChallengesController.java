package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.io.IOException;
import java.util.ArrayList;

public class ChallengesController extends Controller {

    @FXML
    public Button backBtn;
    @FXML
    public Button logoutBtn;
    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label rewardLabel;



    private ArrayList<Challenge> challanges = new ArrayList<>();

    public void initialize() {
        UserRepository userRepository = UserRepository.getInstance();

        progressBar.setProgress(userRepository.getBicyclePoints(userRepository.getLoggedInUser()) / 400);

        if(progressBar.getProgress() == 1)
            rewardLabel.setText("CHALLANGE COMPLEET");

    }

    public void addChallanges() {
        //challanges.add(new Challenge(7, ))

    }



    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
