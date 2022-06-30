module com.example.client0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.client0 to javafx.fxml;
    exports com.example.client0;
}