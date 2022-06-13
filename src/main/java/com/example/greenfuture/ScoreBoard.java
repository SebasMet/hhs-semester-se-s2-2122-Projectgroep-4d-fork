package com.example.greenfuture;

import java.util.*;

public class ScoreBoard{
    private int points;
    private String UserName;

    public static ArrayList<ScoreBoard> scoreboardPoints = new ArrayList<ScoreBoard>();

    public ScoreBoard(int points, String UserName){
        this.points = points;
        this.UserName = UserName;

    }

    public static int CheckForUserID(String userID){ //checkt of de User al een value heeft in de arraylist scoreboardpoints
        int User = -1;
        for (int i = 0; i < scoreboardPoints.size(); i++){
            if (scoreboardPoints.get(i).getUserName().equalsIgnoreCase(userID)){
                User = i;
            }
        }
        return User;
    }


    public static void AddPoints(int points, String userID){ // voegt punten toe aan de user als de user nog geen punten heeft wordt die aangemaakt
        int User = CheckForUserID(userID);
        if (User == -1){
            scoreboardPoints.add(new ScoreBoard(points, userID));
        } else{
            int NewPoints = points + scoreboardPoints.get(User).getPoints();
            scoreboardPoints.get(User).setPoints(NewPoints);
        }

    }

    public static ArrayList<String> PrintScoreboardPoints(){ // print de arraylist scoreboardPoints
        SortScoreboardPoints();
        ArrayList<String> List = new ArrayList<>();
        for (int i = 0; i < scoreboardPoints.size(); i++){
            List.add(i + ": " + scoreboardPoints.get(i).getUserName() + " Punten: " + scoreboardPoints.get(i).getPoints());
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


    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getUserName() {
        return UserName;
    }

    public static void initialize(){
        scoreboardPoints.add(new ScoreBoard(124,"Person1"));
        scoreboardPoints.add(new ScoreBoard(314,"Person2"));
        scoreboardPoints.add(new ScoreBoard(345,"Person3"));
        scoreboardPoints.add(new ScoreBoard(456,"Person4"));
        scoreboardPoints.add(new ScoreBoard(123,"Person5"));
        scoreboardPoints.add(new ScoreBoard(234,"Person6"));
        scoreboardPoints.add(new ScoreBoard(234672834,"Person7"));
        scoreboardPoints.add(new ScoreBoard(234,"Person8"));
        scoreboardPoints.add(new ScoreBoard(543,"Person9"));
    }
}
