module com.main.ejercicio1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.main.ejercicio1_4 to javafx.fxml;
    exports com.main.ejercicio1_4;
}
