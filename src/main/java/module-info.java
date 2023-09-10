module com.brayanvargas.taller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.brayanvargas.app to javafx.fxml;
    exports com.brayanvargas.app;
}