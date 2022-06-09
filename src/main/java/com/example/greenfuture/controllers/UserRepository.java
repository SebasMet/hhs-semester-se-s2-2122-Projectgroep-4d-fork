package com.example.greenfuture.controllers;

import java.util.HashMap;

public class UserRepository {

    private static UserRepository instance = null;
    
    private HashMap<String, User> users = new HashMap<>();

    private UserRepository() {}
    
    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

   public void add(String username, String password) {
        users.put(username, new User(password, false));
   }

   public String getPassword(String username) {
        if(users.containsKey(username)) {
            return users.get(username).getPassword();
        }
        else {
            System.out.println("This user doesnt exist");
        }
        return null;
   }

   public boolean exists(String username) {
       if (users.containsKey(username))
           return true;
       else
           return false;
   }
}
