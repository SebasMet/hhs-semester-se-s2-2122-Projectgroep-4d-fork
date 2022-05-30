package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AccountController extends Controller {

    public Button logoutBtn;
    public Button backBtn;
    public PasswordField oldPassField;
    public Button confirmBtn;
    public PasswordField newPassField;
    public TextField nameField;

    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }
}
