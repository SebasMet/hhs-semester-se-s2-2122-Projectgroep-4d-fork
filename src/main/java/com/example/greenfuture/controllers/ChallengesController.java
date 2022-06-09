package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.util.ArrayList;

public class ChallengesController extends Controller {

    public Button backBtn;
    public Button logoutBtn;

    private ArrayList<Challenge> challanges = new ArrayList<>();

    public void addChallanges() {
        //challanges.add(new Challenge(7, ))

    }



    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
