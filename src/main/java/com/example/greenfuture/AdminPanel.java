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

    @FXML
    private ContextMenu deleteMenu;

    @FXML
    private ListView<String> listOfUsers;

    @FXML
    private Button printTest;

    @FXML
    void addUsers(ActionEvent event) {
        addUsers();
        ObservableList<String> names = FXCollections.observableArrayList(addUsers());
        listOfUsers.setItems(names);
    }

    @FXML
    void onClick(MouseEvent event) {
        //System.out.println("clicked on " + listOfUsers.getSelectionModel().getSelectedItem());

    }

    @FXML
    void deleteUser(ActionEvent event) {
        System.out.println(listOfUsers.getSelectionModel().getSelectedItem() + "Deleted");
    }

    public List<String> addUsers() {
        //Deze applicatie moet deze list van de SignInPage krijgen
        HashMap<String, String> users = new HashMap<>();

        users.put("Ahmet", "123");
        users.put("Jochem", "1234");
        users.put("Sebastian", "12345");
        users.put("Vashy", "123456");
        users.put("Michael1", "1234567");
        users.put("Ahmet1", "123");
        users.put("Jochem1", "1234");
        users.put("Sebastian1", "12345");
        users.put("Vashy1", "123456");
        users.put("Michael2", "1234567");
        users.put("Ahmet3", "123");
        users.put("Jochem4", "1234");
        users.put("Sebastian5", "12345");
        users.put("Vashy3", "123456");
        users.put("Michael143", "1234567");
        users.put("Sebasti1an1", "12345");
        users.put("Vashy11", "123456");
        users.put("Michae1l2", "1234567");
        users.put("Ahmet31", "123");
        users.put("Jochem14", "1234");
        users.put("Sebast1ian5", "12345");
        users.put("Vashy31", "123456");
        users.put("Michae1l143", "1234567");

        List<String> usersString = users.keySet().stream().collect(Collectors.toList());
        for (int i = 0; i < usersString.size(); i++) {
            System.out.println(usersString.get(i));
        }

        return usersString;
    }
}