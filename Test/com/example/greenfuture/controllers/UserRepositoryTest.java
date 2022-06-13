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
        userRepository.add("Vashy", "Starttest123!");
        userRepository.add("Vashy2", "tarttest123");
        userRepository.add("Vashy3", "tarttesttttt");
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
        for (Object s : set){
            user = users.get((String)s);

            if (user.isAdmin()){
                System.out.println(s + ": is succesvol toegevoegd en Admin");
            }
            else{
                System.out.println(s + ": is succesvol toegevoegd maar geen Admin");
            }
        }


    }


    @Test
    void getPassword() {
        UserRepository userRepository = UserRepository.getInstance();
        HashMap<String, User> users = userRepository.getAll();
        user = users.get("AdminT");

//        if (user.isAdmin()){
//            System.out.println("is succesvol toegevoegd en Admin");
//        }
//        else{
//            System.out.println("is succesvol toegevoegd maar geen Admin");
//        }

//        System.out.println(userRepository.getAll().keySet().toArray());

        Object[] set = userRepository.getAll().values().toArray();
        for (Object s : set){
            user = ((User)s);

            String ss = user.getPassword();

            if (ss.length()> 10){
                boolean hasNumber = false;
                boolean hasUpperCase = false;


                char[] chars = user.getPassword().toCharArray();
                for (char c: chars) {
                    if (Character.isDigit(c)){
                        hasNumber = true;

                    }
                }
                for (char c: chars) {
                    if (Character.isUpperCase(c)){
                        hasUpperCase = true;

                    }
                }

                if (hasNumber && hasUpperCase){
                    System.out.println(user.getPassword() + " wachtwoord is sterk");
                }
                else if (hasNumber || hasUpperCase) {
                    System.out.println(user.getPassword() + " wachtwoord is matig");
                }
                else {
                    System.out.println(user.getPassword() + " wachtwoord is zwak");
                }

            }
            else{
                System.out.println(user.getPassword() + " wachtwoord is te kort");
            }
        }
    }


    @Test
    void delete() {
        UserRepository userRepository = UserRepository.getInstance();
        HashMap<String, User> users = userRepository.getAll();
        userRepository.delete("Vashy");
        userRepository.delete("Vashy2");
        userRepository.delete("Vashy3");
        userRepository.delete("AdminT");

        Object[] set = userRepository.getAll().keySet().toArray();
        for (Object s : set){
            user = users.get((String)s);

            if (users.containsKey(s)){
                System.out.println(s + " bestaat nog");
            }
            else {
                System.out.println("gebruikers succesvol gedelete");
            }
        }
    }

//    @Test
//    void requirementsName() {
//        UserRepository userRepository = UserRepository.getInstance();
//        HashMap<String, User> users = userRepository.getAll();
//
//        Object[] set = userRepository.getAll().keySet().toArray();
//        for (Object s : set){
//            user = ((User)s);
//
////            String s = user.getUsername();
////            user = users.get((String)s);
//
//            if (s.length()> 4){
////                String specialChars = "/!@#$%^&()"{}_[]|\?/<>,.";
//                boolean hasSpecialChar = false;
//                boolean hasNumber = false;
//
//
//
//                char[] chars = user.getPassword().toCharArray();
//                for (char c: chars) {
//                    if (Character.isDigit(c)){
//                        hasNumber = true;
//
//                    }
//                }
//                for (char c: chars) {
//                    if (Character.isUpperCase(c)){
//                        hasUpperCase = true;
//
//                    }
//                }
//
//                if (hasNumber){
//                    System.out.println(user.getPassword() + " gebruikersnaam heeft een illegale character");
//
//                }
//                else {
//                    System.out.println("");
//                }
//            }
//
//        }
//
//    }
}

