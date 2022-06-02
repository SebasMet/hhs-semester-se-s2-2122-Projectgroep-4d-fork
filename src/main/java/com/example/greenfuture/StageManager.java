package com.example.greenfuture;

import javafx.stage.Stage;

public class StageManager {

    private Stage stage;

    private static StageManager instance = null;

    private StageManager() {}

    public static StageManager getInstance() {
        if (instance == null) {
            instance = new StageManager();
        }
        return instance;
    }

    public void setStage(Stage newStage) {
        stage = newStage;
    }

    public Stage getStage() {
        return stage;
    }
}
