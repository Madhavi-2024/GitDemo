module com.example.testng {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testng to javafx.fxml;
    exports com.example.testng;
}