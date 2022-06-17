package com.example.greenfuture.controllers;

public class BadgeFactory {
    
    public Badge getBadge(String badgeType) {
        switch(badgeType) {
            case "challange": 
                return new ChallengeBadge();
            case "top" : 
                return new TopTenBadge();
            case"innovater" :
                return new InnovatorBadge();
            default:
                return null;
        }
    }
}

