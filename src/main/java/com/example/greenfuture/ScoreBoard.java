package com.example.greenfuture;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.*;

public class ScoreBoard{
    private double points;
    private int UserID;

    public static ArrayList<ScoreBoard> scoreboardPoints = new ArrayList<ScoreBoard>();

    public ScoreBoard(double points, int UserID){
        this.points = points;
        this.UserID = UserID;

    }

    public int CheckForUserID(int userID){ //checkt of de User al een value heeft in de arraylist scoreboardpoints
        int User = -1;
        for (int i = 0; i < scoreboardPoints.size(); i++){
            if (scoreboardPoints.get(i).getUserID() == userID){
                User = i;
            }
        }
        return User;
    }


    public void AddPoints(double points, int userID){ // voegt punten toe aan de user als de user nog geen punten heeft wordt die aangemaakt
        int User = CheckForUserID(userID);
        if (User == -1){
            scoreboardPoints.add(new ScoreBoard(points, userID));
        } else{
            double NewPoints = points + scoreboardPoints.get(User).getPoints();
            scoreboardPoints.get(User).setPoints(NewPoints);
        }

    }

    public static ArrayList<String> PrintScoreboardPoints(){ // print de arraylist scoreboardPoints
        SortScoreboardPoints();
        ArrayList<String> List = new ArrayList<>();
        for (int i = 0; i < scoreboardPoints.size(); i++){
            List.add(i + ": " + scoreboardPoints.get(i).getUserID() + " Punten: " + scoreboardPoints.get(i).getPoints());
        }
        return List;
    }

    public static void SortScoreboardPoints(){ //sorteert de arraylist scoreboard points op basis van punten
        Collections.sort(scoreboardPoints, comparator);
    }

    public static Comparator<ScoreBoard> comparator = new Comparator<ScoreBoard>() {
        @Override
        public int compare(ScoreBoard o1, ScoreBoard o2) {
            if (o1.getPoints() < o2.getPoints()) return -1;
            if (o1.getPoints() > o2.getPoints()) return 1;
            return 0;
        }
    };


    public static ArrayList<ScoreBoard> getScoreboardPoints() {
        return scoreboardPoints;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getPoints() {
        return points;
    }

    public int getUserID() {
        return UserID;
    }

    public static void initialize(){
        scoreboardPoints.add(new ScoreBoard(124,1));
        scoreboardPoints.add(new ScoreBoard(314,2));
        scoreboardPoints.add(new ScoreBoard(345,3));
        scoreboardPoints.add(new ScoreBoard(456,4));
        scoreboardPoints.add(new ScoreBoard(123,5));
        scoreboardPoints.add(new ScoreBoard(234,6));
        scoreboardPoints.add(new ScoreBoard(234672834,7));
        scoreboardPoints.add(new ScoreBoard(234,8));
        scoreboardPoints.add(new ScoreBoard(543,9));
    }
}
