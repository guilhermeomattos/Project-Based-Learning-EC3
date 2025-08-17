module com.mycompany.simuladorondas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens com.mycompany.simuladorondas.Controller to javafx.fxml;
    exports com.mycompany.simuladorondas;
}
