package com.example.greenfuture.controllers;

public interface Badge {
    void activateBadge();

}

class TopTenBadge implements Badge {

    @Override
    public void activateBadge() {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.setActiveBadge("Top 10", "Sebas");
    }
}

class ChallengeBadge implements Badge {

    @Override
    public void activateBadge() {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.setActiveBadge("Challanger", "Sebas");
    }
}

class InnovatorBadge implements Badge {

    @Override
    public void activateBadge() {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.setActiveBadge("Innovater", "Sebas");
    }
}


