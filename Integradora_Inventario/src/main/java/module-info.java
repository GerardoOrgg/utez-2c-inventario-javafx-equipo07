module com.example.integradora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.integradora_inventario to javafx.fxml;
    exports com.example.integradora_inventario;

    opens com.example.integradora_inventario.ProductoService to javafx.fxml;
    exports com.example.integradora_inventario.ProductoService;

    opens com.example.integradora_inventario.Model to javafx.fxml;
    exports com.example.integradora_inventario.Model;

    opens com.example.integradora_inventario.Controllers to javafx.fxml;
    exports com.example.integradora_inventario.Controllers;


}