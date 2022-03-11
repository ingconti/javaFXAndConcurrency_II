module com.example.javafxandconcurrency_ii {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxAndConcurrency to javafx.fxml;
    exports com.example.javafxAndConcurrency;
}