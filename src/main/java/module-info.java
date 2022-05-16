module com.example.greenfuture {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.greenfuture to javafx.fxml;
    exports com.example.greenfuture;
}