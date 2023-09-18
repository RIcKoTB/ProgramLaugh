module com.example.programlaugh {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.programlaugh to javafx.fxml;
    exports com.example.programlaugh;
    exports com.example.programlaugh.ui;
    opens com.example.programlaugh.ui to javafx.fxml;
}