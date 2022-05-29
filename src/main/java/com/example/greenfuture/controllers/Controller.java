package com.example.greenfuture.controllers;

import com.example.greenfuture.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public abstract class Controller {

    protected void changeScene(ActionEvent event, String filename, String titleName) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Controller.class.getResource("fxml/" + filename + ".fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(titleName);
        stage.setScene(scene);
        stage.show();
    }

    protected void changeScene(String filename, String titleName) throws IOException {

        ActionEvent event = new ActionEvent();
        Stage stage = new Stage();
        URL url = getClass().getResource("/com/example/greenfuture/fxml/" + filename + ".fxml");
        FXMLLoader loader = new FXMLLoader(url);
        Parent parent = loader.load();

        Scene scene = new Scene(parent, 800, 600);
        stage.setTitle(titleName);
        stage.setScene(scene);
        stage.show();
    }
}
