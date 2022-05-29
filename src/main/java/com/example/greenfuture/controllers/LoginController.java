package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class LoginController extends Controller {

    @FXML
    private PasswordField passField;

    @FXML
    private TextField nameField;

    @FXML
    private Label welcomeLabel;

    @FXML
    private void onLoginButtonClick() throws IOException {
        HashMap<String, String> users = new HashMap<>();

        users.put("Ahmet", "123");
        users.put("Jochem", "1234");
        users.put("Sebastian", "12345");
        users.put("Vashy", "123456");
        users.put("Maikel", "1234567");

        if (users.containsKey(nameField.getText())) {
            String passwordOfUser = users.get(nameField.getText());

            if (Objects.equals(passwordOfUser, passField.getText())) {
                welcomeLabel.setText("Inlog succesvol");
                changeScene("dashboard", "Dashboard");
            } else
                welcomeLabel.setText("Dit wachtwoord is incorrect");
        } else
            welcomeLabel.setText("Deze gebruiker bestaat niet");
    }
}