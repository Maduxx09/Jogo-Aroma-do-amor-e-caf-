package com.mycompany.jogo.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import com.mycompany.jogo.App;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {

    @FXML
    private ImageView titulo;

    private final Image normal = new Image(getClass().getResourceAsStream("/com/mycompany/jogo/titulo.png"));
    private final Image hover = new Image(getClass().getResourceAsStream("/com/mycompany/jogo/titulo2.png"));

    @FXML
    private void initialize() {
        titulo.setImage(normal);

        titulo.setOnMouseEntered(e -> titulo.setImage(hover));
        titulo.setOnMouseExited(e -> titulo.setImage(normal));

        // tamanho responsivo (opcional)
        titulo.sceneProperty().addListener((obs, old, scene) -> {
            if (scene != null) {
                titulo.fitWidthProperty().bind(scene.widthProperty().multiply(0.45));
            }
        });
    }

    @FXML
    private void irParaGameplay() throws IOException {
        App.setRoot("gameplay");
    }

    @FXML
    private void irParaRanking() {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Ranking");
        a.setContentText("Em desenvolvimento.");
        a.showAndWait();
    }

    @FXML
    private void irParaUpgrades() throws IOException {
        App.setRoot("loja");
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