module com.example.greenfuture {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;


    opens com.example.greenfuture to javafx.fxml;
    exports com.example.greenfuture;
    exports com.example.greenfuture.controllers;
    opens com.example.greenfuture.controllers to javafx.fxml;
}