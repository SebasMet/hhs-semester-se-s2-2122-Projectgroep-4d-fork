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
        UserRepository userRepository = UserRepository.getInstance();

        userRepository.add("Sebas", "pass");
        userRepository.addAdmin("Admin", "pass");

        if (userRepository.exists(nameField.getText())) {

            if (Objects.equals(userRepository.getPassword(nameField.getText()), passField.getText())) {
                if (userRepository.isAdmin(nameField.getText())) {
                    changeScene("adminPanel", "Administrator log-in");
                } else {
                    userRepository.setLoggedInUser(nameField.getText());
                    welcomeLabel.setText("Inlog succesvol");
                    toDashboard();
                }
            } else
                welcomeLabel.setText("Dit wachtwoord is incorrect");
        } else
            welcomeLabel.setText("Deze gebruiker bestaat niet");
    }
}

