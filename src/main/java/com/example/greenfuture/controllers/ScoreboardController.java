package com.example.greenfuture.controllers;

import com.example.greenfuture.ScoreBoard;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ScoreboardController extends Controller implements Initializable {

    public GridPane board;
    public Button logoutBtn;

    @FXML
    private ListView<String> List;

    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ScoreBoard.initialize();
        List.getItems().addAll(ScoreBoard.PrintScoreboardPoints());
    }
}
