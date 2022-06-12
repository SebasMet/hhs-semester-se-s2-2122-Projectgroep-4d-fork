package com.example.greenfuture;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GreenFuture extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ScoreBoard.initialize();
        StageManager stageManager = StageManager.getInstance();
        FXMLLoader fxmlLoader = new FXMLLoader(GreenFuture.class.getResource("fxml/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setResizable(false);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        stageManager.setStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}