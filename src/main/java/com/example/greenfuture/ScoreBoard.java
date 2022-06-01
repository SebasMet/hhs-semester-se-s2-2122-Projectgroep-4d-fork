package com.example.greenfuture;

import java.util.ArrayList;

public class ScoreBoard {
    private int points;
    private int UserID;

    public static ArrayList<ScoreBoard> scoreboardPoints = new ArrayList<ScoreBoard>();

    public ScoreBoard(int points, int UserID){
        this.points = points;
        this.UserID = UserID;

    }

    public void AddPoints(int points, int userID){
        int 
        for (int i = 0; i < scoreboardPoints.size(); i++){
            if ()
        }

    }

    public static ArrayList<ScoreBoard> getScoreboardPoints() {
        return scoreboardPoints;
    }

    public int getPoints() {
        return points;
    }

    public int getUserID() {
        return UserID;
    }
}
