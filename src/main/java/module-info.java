module com.semaforo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.semaforo to javafx.fxml;
    exports com.semaforo;
}
