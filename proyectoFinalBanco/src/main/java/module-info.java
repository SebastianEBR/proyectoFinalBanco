module org.uniquindio.edu.co.poo.proyectofinalbanco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.uniquindio.edu.co.poo.proyectofinalbanco to javafx.fxml;
    exports org.uniquindio.edu.co.poo.proyectofinalbanco;
    exports org.uniquindio.edu.co.poo.proyectofinalbanco.app;
    opens org.uniquindio.edu.co.poo.proyectofinalbanco.app to javafx.fxml;
}