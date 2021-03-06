package com.example.greenfuture.controllers;

//JavaFX imports
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

//Java imports
import java.io.IOException;
import java.util.*;


public class AdminPanel extends Controller {

    @FXML
    private ContextMenu deleteMenu;

    @FXML
    private ListView<String> listOfUsers;

    @FXML
    private Button printTest;

    @FXML
    private CheckBox adminCheckBox;

    @FXML
    private Label showResult;

    @FXML
    private PasswordField passfieldAdd;

    @FXML
    private PasswordField passfieldConfirmAdd;

    @FXML
    private TextField usernameAdd;

    @FXML
    private Label badgeOutputText;

    @FXML
    private TextField badgeTextField;


    public void initialize() {
        addUsers();
    }

    @FXML
    void onBadgeButtonClicked() {
        BadgeFactory badgeFactory = new BadgeFactory();

        if(badgeTextField.getText().isEmpty())
            badgeOutputText.setText("TextField can't be empty");

        Badge badge = badgeFactory.getBadge(badgeTextField.getText());

        badge.activateBadge();
    }



    @FXML
    void onAddButtonClicked() {
        UserRepository userRepository = UserRepository.getInstance();
        if (usernameAdd.getCharacters().isEmpty() || passfieldAdd.getCharacters().isEmpty()) {
            showResult.setText("Passfield or username cant be empty");
            return;
        }
        if (userRepository.exists(usernameAdd.getText()))
            showResult.setText("Deze gebruikersnaam is niet beschikbaar");
        else {
            if (passfieldAdd.getText().equals(passfieldConfirmAdd.getText())) {
                if (adminCheckBox.isSelected()) {
                    userRepository.addAdmin(usernameAdd.getText(), passfieldConfirmAdd.getText());
                    showResult.setText("Admin added");
                    addUsers();
                } else {
                    userRepository.add(usernameAdd.getText(), passfieldConfirmAdd.getText());
                    showResult.setText("User added");
                    addUsers();
                }
            }
            else
                showResult.setText("De wachtwoorden komen niet overeen");
        }
    }


    @FXML
    void addUsers() {
        UserRepository userRepository = UserRepository.getInstance();
        Set<String> keySet = userRepository.getAll().keySet();

        ArrayList<String> listOfKeys = new ArrayList<>(keySet);

        ObservableList<String> names = FXCollections.observableArrayList(listOfKeys);
        listOfUsers.setItems(names);
    }

    @FXML
    void deleteUser(ActionEvent event) {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.delete(listOfUsers.getSelectionModel().getSelectedItem());
        addUsers();
    }

    @FXML
    void goToLogin() throws IOException {
        changeScene("login", "Log-in");
    }
}