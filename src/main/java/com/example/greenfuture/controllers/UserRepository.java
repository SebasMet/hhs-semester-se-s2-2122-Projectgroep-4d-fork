package com.example.greenfuture.controllers;

import java.util.HashMap;

public class UserRepository {

    private String loggedInUser;

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

   public void addAdmin(String username, String password) {
        users.put(username, new User(password, true));
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

   public boolean isAdmin(String username) {return users.get(username).isAdmin();}

   public void delete(String username) {
        users.remove(username);
   }

   public HashMap getAll() {
        return users;
    }

    public void addPoints(String username, int points) {
        users.get(username).addPoints(points);
    }

    public void addBicyclePoints(String username, int points) {
        users.get(username).addBicyclePoints(points);
    }

    public void addDieselPoints(String username, int points) {
        users.get(username).addDieselAutoPoints(points);
    }

    public void addGasolinePoints(String username, int points) {
        users.get(username).addGasolineCarPoints(points);
    }

    public void addHybridePoints(String username, int points) {
        users.get(username).addHybrideAutoPoints(points);
    }

    public void addBusPoints(String username, int points) {
        users.get(username).addBusPoints(points);
    }

    public void addElectricPoints(String username, int points) {
        users.get(username).addElectricAutoPoints(points);
    }

    public double getBicyclePoints(String username) {
        return users.get(username).getBicyclePoints();
    }

    public double getDieselPoints(String username) {
        return users.get(username).getDieselAutoPoints();
    }

    public double getGasolinePoints(String username) {
        return users.get(username).getGasolineCarPoints();
    }

    public double getHybridePoints(String username) {
        return users.get(username).getHybrideAutoPoints();
    }

    public double getBusPoints(String username) {
        return users.get(username).getBusPoints();
    }

    public double getElectricPoints(String username) {
        return users.get(username).getElectricAutoPoints();
    }




    public int getPoints(String username) {
        return users.get(username).getPoints();
    }

    public void logIn(String username) {
        users.get(username).setLoggedIn(true);
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(String loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public void setPassword(String username, String password) {
        users.get(username).setNewPassword(password);
    }
}
