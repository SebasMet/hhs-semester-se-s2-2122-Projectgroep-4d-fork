package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;

public class AccountController extends Controller {

    public Button logoutBtn;
    public Button backBtn;
    public PasswordField oldPassField;
    public Button confirmBtn;
    public PasswordField newPassField;
    public TextField nameField;

    @FXML
    private Label pointsLabel;

    @FXML
    private Label showResult;

    @FXML
    private Label badgeLabel;

    public void initialize() {
        UserRepository userRepository = UserRepository.getInstance();
        pointsLabel.setText(String.valueOf(userRepository.getPoints(userRepository.getLoggedInUser())));
        badgeLabel.setText(userRepository.getActiveBadge("Sebas"));
    }

    @FXML
    public void onConfirmBtnClick() {
        UserRepository userRepository = UserRepository.getInstance();

        if (nameField.getCharacters().isEmpty() || oldPassField.getCharacters().isEmpty() || newPassField.getCharacters().isEmpty()) {
            showResult.setText("Passfield or username cant be empty");
            return;
        }
        if (!userRepository.exists(nameField.getText()))
            showResult.setText("Deze gebruiker bestaat niet");
        else {
            if (userRepository.getPassword(nameField.getText()).equals(oldPassField.getText())) {
                userRepository.setPassword(nameField.getText(), newPassField.getText());
                showResult.setText("Wachtwoord veranderd");
            } else
                showResult.setText("Dit wachtwoord is niet gekopped aan de ingevoerde gebruiker");
        }
    }


    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
