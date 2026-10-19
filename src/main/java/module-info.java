module com.mycompany.jogo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.mycompany.jogo to javafx.fxml;
    exports com.mycompany.jogo;
    
    opens com.mycompany.jogo.controller to javafx.fxml;
    exports com.mycompany.jogo.controller;
}
