package com.example.greenfuture.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Arrays;




class TestUserRepository {
    private User user;
    private java.lang.String nameField;
    private PasswordField passField;

    @BeforeEach
    void setUp() throws Exception {
        UserRepository userRepository = UserRepository.getInstance();
        userRepository.add("Gau", "Starttest 123!");
        userRepository.add("Vashy", "Starttest123!");
        userRepository.add("Vashy Sitaldin 2", "tarttest123");
        userRepository.add("V3", "tarttesttttt");
        userRepository.addAdmin("AdminT", "pass2");


    }


    @Test
    void addUsersAndCheckIfAdmin() {

        UserRepository userRepository = UserRepository.getInstance();
        HashMap<String, User> users = userRepository.getAll();

//        if (user.isAdmin()){
//            System.out.println("is succesvol toegevoegd en Admin");
//        }
//        else{
//            System.out.println("is succesvol toegevoegd maar geen Admin");
//        }

//        System.out.println(userRepository.getAll().keySet().toArray());

        Object[] set = userRepository.getAll().keySet().toArray();
        for (Object s : set) {
            user = users.get((String) s);

            if (user.isAdmin()) {
                System.out.println(s + ": is succesvol toegevoegd en Admin");
            } else {
                System.out.println(s + ": is succesvol toegevoegd maar geen Admin");
            }
        }


    }


    @Test
    void getPassword() {
        UserRepository userRepository = UserRepository.getInstance();
        HashMap<String, User> users = userRepository.getAll();

//        user = users.get("AdminT");
//        if (user.isAdmin()){
//            System.out.println("is succesvol toegevoegd en Admin");
//        }
//        else{
//            System.out.println("is succesvol toegevoegd maar geen Admin");
//        }

//        System.out.println(userRepository.getAll().keySet().toArray());

        Object[] set = userRepository.getAll().values().toArray();
        for (Object s : set) {
            user = ((User) s);

            String ss = user.getPassword();
            boolean acceptabelWachtwoord = false;

            if (ss.length() > 10) {
                boolean hasNumber = false;
                boolean hasUpperCase = false;
                boolean hasWhiteSpace = false;
                boolean hasSpecial = false;
                String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";


                char[] chars = user.getPassword().toCharArray();
                for (char c : chars) {
                    if (Character.isDigit(c)) {
                        hasNumber = true;

                    }
                    if (Character.isUpperCase(c)) {
                        hasUpperCase = true;

                    }
                    if (c == ' '){
                        hasWhiteSpace = true;

                    }
                    if (specialCharactersString.contains(Character.toString(c))) {
                        hasSpecial = true;

                    }
                }

                if (hasNumber && hasUpperCase && hasSpecial) {
                    System.out.println(user.getPassword() + " wachtwoord is sterk");
                    acceptabelWachtwoord = true;
                } else if (hasNumber && hasUpperCase || hasSpecial && hasNumber || hasSpecial && hasUpperCase) {
                    System.out.println(user.getPassword() + " wachtwoord is goed");
                    acceptabelWachtwoord = true;
                } else if (hasNumber || hasUpperCase || hasSpecial) {
                        System.out.println(user.getPassword() + " wachtwoord is matig");
                } else {
                    System.out.println(user.getPassword() + " wachtwoord is zwak");
                }
                if(hasWhiteSpace){
                    acceptabelWachtwoord = false;
                }


            } else {
                System.out.println(user.getPassword() + " wachtwoord is te kort");
            }
            if (acceptabelWachtwoord){
                System.out.println("Wachtwoord voldoet aan de eisen, wordt aangemaakt");
            }
            else {
                System.out.println("Wachtwoord voldoet niet aan de eisen, wordt ook niet aangemaakt");
            }
        }
    }


    @Test
    void delete() {
        UserRepository userRepository = UserRepository.getInstance();
        HashMap<String, User> users = userRepository.getAll();
//        userRepository.delete("Gau");
        userRepository.delete("Vashy");
        userRepository.delete("Vashy Sitaldin 2");
        userRepository.delete("V3");
        userRepository.delete("AdminT");

        Object[] set = userRepository.getAll().keySet().toArray();
        for (Object s : set) {
            user = users.get((String) s);

            if (users.containsKey(s)) {
                System.out.println(s + " bestaat nog");
            }
        }
        if (set.length == 1){
            System.out.println("users succesvol verwijderd");
        }

    }


    @Test
    void reqName() {

        UserRepository userRepository = UserRepository.getInstance();
        HashMap<String, User> users = userRepository.getAll();

        Object[] set = userRepository.getAll().keySet().toArray();
        for (Object s : set) {
            String varString = (String) s;                   //maakt gelijk string van het object
            user = users.get(varString);

            if (varString.matches("[a-zA-Z]+")) {            //stuurt string gelijk door ipv object (volgorde)
                System.out.println(s + " > bevat geen illegale characters");
            } else {
                System.out.println(s + " > bevat een illegale character");
            }
        }


    }


    @Test
    void reqNameExtended() {
        UserRepository userRepository = UserRepository.getInstance();
        HashMap<String, User> users = userRepository.getAll();



        Object[] set = userRepository.getAll().keySet().toArray();
        for (Object s : set) {
            String varString = (String) s;
            user = users.get(varString);
            boolean acceptabelNaam = false;

            if (varString.length() >= 3) {
                boolean hasUpperCase = false;
                boolean hasWhiteSpace = false;

                char[] charsUserName = varString.toCharArray();
                for (char c: charsUserName) {
                    if (Character.isUpperCase(c)){
                        hasUpperCase = true;

                    }
                    if (c == ' '){
                        hasWhiteSpace = true;


                    }

                }

                if (hasUpperCase && hasWhiteSpace) {
                    acceptabelNaam = true;
                }

            }
            if (acceptabelNaam){
                System.out.println(s + " Naam voldoet aan de eisen, wordt aangemaakt.");
            }
            else {
                System.out.println(s + " Naam voldoet niet aan de eisen, wordt ook niet aangemaakt.  Controleer op spaties, lengte en hoofdletters (voor- en achternaam).");
            }
        }
    }

}

