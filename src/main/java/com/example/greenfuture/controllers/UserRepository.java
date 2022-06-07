package com.example.greenfuture.controllers;

import java.util.HashMap;

public class UserRepository {

    private static UserRepository instance = null;
    
    private HashMap<String, String> users = new HashMap<>();

    private UserRepository() {}
    
    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

   public void addUser(String username, String password) {
        users.put(username, password);
   }

   public String getPassword(String username) {
        if(users.containsKey(username)) {
            return users.get(username);
        }
        else {
            System.out.println("This user doesnt exist");
        }
        return null;
   }
}
