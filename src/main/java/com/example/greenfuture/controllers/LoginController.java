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

        if (userRepository.exists(nameField.getText())) {

            if (Objects.equals(userRepository.getPassword(nameField.getText()), passField.getText())) {
                welcomeLabel.setText("Inlog succesvol");
                toDashboard();
            } else
                welcomeLabel.setText("Dit wachtwoord is incorrect");
        } else
            welcomeLabel.setText("Deze gebruiker bestaat niet");
    }

    @FXML
    private void onAdminLoginButtonClick() throws IOException {
        HashMap<String, String> admins = new HashMap<>();

        admins.put("admin", "123");

        if (admins.containsKey(nameField.getText())) {
            String passwordOfUser = admins.get(nameField.getText());

            if (Objects.equals(passwordOfUser, passField.getText())) {
                welcomeLabel.setText("Inlog succesvol");
                changeScene("adminPanel", "Administrator log-in");
                
            } else
                welcomeLabel.setText("Dit wachtwoord is incorrect");
        } else
            welcomeLabel.setText("Deze gebruiker bestaat niet");
    }
}
