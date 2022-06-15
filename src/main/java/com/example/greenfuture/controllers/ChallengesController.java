package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.io.IOException;
import java.util.ArrayList;

public class ChallengesController extends Controller {

    @FXML
    private Button backBtn;

    @FXML
    private Label contentLabel;

    @FXML
    private Label contentLabel1;

    @FXML
    private Label contentLabel2;

    @FXML
    private Button logoutBtn;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private ProgressBar progressBar1;

    @FXML
    private ProgressBar progressBar2;

    @FXML
    private Label rewardLabel;

    @FXML
    private Label rewardLabel1;

    @FXML
    private Label rewardLabel2;

    @FXML
    private Label timeLabel;

    @FXML
    private Label timeLabel1;

    @FXML
    private Label timeLabel2;

    private ArrayList<Challenge> challenges = new ArrayList<>();


    public void initialize() {
        UserRepository userRepository = UserRepository.getInstance();

        addChallanges();
        showChallanges();

        progressBar.setProgress(userRepository.getBicyclePoints(userRepository.getLoggedInUser()) / challenges.get(0).getPoints());
        progressBar1.setProgress(userRepository.getBusPoints(userRepository.getLoggedInUser()) / challenges.get(1).getPoints());

        if(progressBar.getProgress() >=1 ) {
            contentLabel.setText("CHALLENGE COMPLEET");
        }
        if(progressBar1.getProgress() >= 1) {
            contentLabel1.setText("CHALLENGE COMPLEET");
        }



    }

    public void addChallanges() {
        challenges.add(new Challenge(3, 400, "Verdien 400 punten met fietsen"));
        challenges.add(new Challenge(4, 500, "Verdien 600 punten door met de Bus te reizen"));
        challenges.add(new Challenge(13, 700, "Reis 500km met een elektrische auto"));

    }

    public void showChallanges() {
        contentLabel.setText(challenges.get(0).getChallengeContent());
        rewardLabel.setText("Beloning: " + challenges.get(0).getPoints() + " punten");
        timeLabel.setText("Resterende tijd: " + challenges.get(0).getDuration() + " dagen");

        contentLabel1.setText(challenges.get(1).getChallengeContent());
        rewardLabel1.setText("Beloning: " + challenges.get(1).getPoints() + " punten");
        timeLabel1.setText("Resterende tijd: " + challenges.get(1).getDuration() + " dagen");

        contentLabel2.setText(challenges.get(2).getChallengeContent());
        rewardLabel2.setText("Beloning: " + challenges.get(2).getPoints() + " punten");
        timeLabel2.setText("Resterende tijd: " + challenges.get(2).getDuration() + " dagen");
    }

    @FXML
    public void giveReward() {
        UserRepository userRepository = UserRepository.getInstance();

        if (progressBar.getProgress() >= 1 && !challenges.get(0).isRewardGiven()) {
            userRepository.addPoints(userRepository.getLoggedInUser(), challenges.get(0).getPoints());
            System.out.println("points given");
            challenges.get(0).setRewardGiven(true);

        }
        if (progressBar1.getProgress() >= 1 && !challenges.get(1).isRewardGiven()) {
            userRepository.addPoints(userRepository.getLoggedInUser(), challenges.get(1).getPoints());
            System.out.println("points given");
            challenges.get(1).setRewardGiven(true);
        }
    }


    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
