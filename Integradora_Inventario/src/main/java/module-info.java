module com.example.integradora_inventario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.integradora_inventario to javafx.fxml;
    exports com.example.integradora_inventario;
}