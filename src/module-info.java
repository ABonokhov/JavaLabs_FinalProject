module TestApp {
    requires javafx.graphics;
    requires  javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens sample;
}