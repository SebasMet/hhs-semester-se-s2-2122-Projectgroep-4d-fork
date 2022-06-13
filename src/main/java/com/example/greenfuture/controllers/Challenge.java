package com.example.greenfuture.controllers;

public class Challenge {
    private int duration;
    private int points;
    private String challengeContent;
    private boolean rewardGiven;

    public Challenge(int duration, int points, String challengeContent, boolean rewardGiven) {
        this.duration = duration;
        this.points = points;
        this.challengeContent = challengeContent;
        this.rewardGiven = rewardGiven;
    }

    public Challenge(int duration, int points, String challengeContent) {
        this.duration = duration;
        this.points = points;
        this.challengeContent = challengeContent;
    }

    public boolean isRewardGiven() {
        return rewardGiven;
    }

    public void setRewardGiven(boolean rewardGiven) {
        this.rewardGiven = rewardGiven;
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
