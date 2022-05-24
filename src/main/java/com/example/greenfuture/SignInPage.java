package com.example.greenfuture;

//JavaFX imports
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;

//Java imports
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class SignInPage {

    @FXML
    private PasswordField pass_field;

    @FXML
    private TextField username_field;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onInlogButtonClick() throws IOException {
        HashMap<String, String> users = new HashMap<>();

        users.put("Ahmet", "123");
        users.put("Jochem", "1234");
        users.put("Sebastian", "12345");
        users.put("Vashy", "123456");
        users.put("Michael", "1234567");

        if (users.containsKey(username_field.getText())) {
            String passwordOfUser = users.get(username_field.getText());

            if (Objects.equals(passwordOfUser, pass_field.getText())) {
                welcomeText.setText("Inlog succesvol");
                //Redirect moet nog geadd worden
            } else
                welcomeText.setText("Dit wachtwoord is incorrect");
        } else
            welcomeText.setText("Deze gebruiker bestaat niet");
    }
}