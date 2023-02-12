module com.example.programalaberinto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programalaberinto to javafx.fxml;
    exports com.example.programalaberinto;
    exports com.example.programalaberinto.Controllers;
    opens com.example.programalaberinto.Controllers to javafx.fxml;
}