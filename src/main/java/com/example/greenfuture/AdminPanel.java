package com.example.greenfuture;

//JavaFX imports
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Side;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

//Java imports
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class AdminPanel {

    private HashMap<String, String> users = new HashMap<>();

    @FXML
    private ContextMenu deleteMenu;

    @FXML
    private ListView<String> listOfUsers;

    @FXML
    private Button printTest;

    @FXML
    private Label showResult;

    @FXML
    private PasswordField passfieldAdd;

    @FXML
    private PasswordField passfieldConfirmAdd;

    @FXML
    private TextField usernameAdd;

    public void initialize() {
        addUsers();
    }

    @FXML
    //TODO: Make testable
    void onAddButtonClicked() {
        if (users.containsKey(usernameAdd.getText()))
            showResult.setText("Deze gebruikersnaam is niet beschikbaar");
        else {
            if(passfieldAdd.getText().equals(passfieldConfirmAdd.getText())) {
                addNewUser(usernameAdd.getText(), passfieldConfirmAdd.getText());
                showResult.setText("User added");
            }
            else
                showResult.setText("De wachtwoorden komen niet overeen");
        }
    }

    private void addNewUser(String username, String password) {
        users.put(username, password);
        addUsers();
    }

    @FXML
    void addUsers() {
        List<String> usersString = new ArrayList<>(users.keySet());
        for (int i = 0; i < usersString.size(); i++) {
            System.out.println(usersString.get(i));
        }

        ObservableList<String> names = FXCollections.observableArrayList(usersString);
        listOfUsers.setItems(names);
    }

    @FXML
    void deleteUser(ActionEvent event) {
        users.remove(listOfUsers.getSelectionModel().getSelectedItem());
        addUsers();
    }
}