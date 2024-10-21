module co.edu.uniquindio.projectparcial2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.projectparcial2 to javafx.fxml;
    exports co.edu.uniquindio.projectparcial2;

    exports co.edu.uniquindio.projectparcial2.viewcontroller;
    opens co.edu.uniquindio.projectparcial2.viewcontroller to javafx.fxml;

}