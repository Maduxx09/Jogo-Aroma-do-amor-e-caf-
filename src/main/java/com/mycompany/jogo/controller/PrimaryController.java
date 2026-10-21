package com.mycompany.jogo.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import com.mycompany.jogo.App;
import javafx.scene.image.ImageView;

public class PrimaryController {
    
    @FXML private ImageView titulo;
    
    @FXML
    private void initialize() {
    titulo.sceneProperty().addListener((obs, oldScene, newScene) -> {
        if (newScene != null) {
            titulo.fitWidthProperty().bind(
                newScene.widthProperty().multiply(0.5)
            );
        }
    });
}
            
    @FXML
    private void irParaGameplay() throws IOException {
        App.setRoot("gameplay");
    }

    @FXML
    private void irParaRanking() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Ranking");
        alerta.setContentText("Em desenvolvimento.");
        alerta.showAndWait();
    }

    @FXML
    private void irParaUpgrades() throws IOException {
        App.setRoot("creditos");
    }

    @FXML
    private void irParaCreditos() throws IOException {
        App.setRoot("creditos");
    }

    @FXML
    private void encerrar() {
        javafx.application.Platform.exit();
    }
}