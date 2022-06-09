package com.example.greenfuture.controllers;

public class Challenge {
    private int duration;
    private int points;
    private String challengeContent;


    public Challenge(int duration, int points, String challengeContent) {
        this.duration = duration;
        this.points = points;
        this.challengeContent = challengeContent;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getChallengeContent() {
        return challengeContent;
    }

    public void setChallengeContent(String challengeContent) {
        this.challengeContent = challengeContent;
    }
}
