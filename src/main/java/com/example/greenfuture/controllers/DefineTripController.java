package com.example.greenfuture.controllers;

import com.example.greenfuture.PointsAssign;
import com.example.greenfuture.ScoreBoard;
import com.example.greenfuture.Trip;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DefineTripController extends Controller {

    @FXML
    public ComboBox<String> vehicleField;
    @FXML
    public TextField distanceField;
    @FXML
    private Button confirmBtn;
    @FXML
    private ListView<String> InfoList;
    @FXML
    private Button InfoButton;



    private final ObservableList<String> vehicleList = FXCollections.observableArrayList(
            "Benzine auto", "Hybride auto", "Diesel auto", "Elektrische auto", "Fiets", "Bus"
    );

    @Override @FXML
    protected void toDashboard() throws IOException {
        super.toDashboard();
    }

    @FXML
    private void confirmTrip() {
        initialize();
        // controleer of alles is ingevuld
        if (distanceField.getCharacters().isEmpty()) return;
        if (vehicleField.getSelectionModel().isEmpty()) return;

        // maak nieuw variable met correcte data
        Trip trip = new Trip(String.valueOf(vehicleField.getSelectionModel().getSelectedItem()), Integer.parseInt(distanceField.getCharacters().toString()), "henk");
        System.out.println(trip.getVehicle() + " - " + trip.getDistance() + " - " + trip.getUser());

        // sla data ergens op

        // calculate points
        calculatePoints(trip);
    }

    @FXML // zorgt er voor dat als de Info button wordt geclickt de InfoList wordt weergegeven en als de list er is, verdwijnt het.
    public void InfoButtonCLicked(Event e){
        if (InfoList.isVisible()){
            InfoList.setVisible(false);
        }else{
            InfoList.setVisible(true);
        }
    }


    private void calculatePoints(Trip trip) {
        PointsAssign pointsAssign = new PointsAssign();
        int points = pointsAssign.calcPoints(trip);
        saveTripData(trip, points);
    }

    private void saveTripData(Trip trip, int points) {
        UserRepository users = UserRepository.getInstance();
        ScoreBoard scoreBoard = new ScoreBoard(1,"!");
        // users geeft issues met de hashmap
        ScoreBoard.AddPoints(points, trip.getUser());
        users.addPoints(trip.getUser(), points);
        System.out.println(users.getPoints(trip.getUser()));
    }

    public void initialize() {
        //vehicleField.getItems().addAll(vehicleList);
        vehicleField.setItems(vehicleList);
        InfoList.getItems().addAll("Punten: ", "Fiets, 0", "Elektrische auto, 3", "Bus, 7", "Hybride auto, 12", "Diesel auto, 18", "Diesel auto, 20");
    }
}