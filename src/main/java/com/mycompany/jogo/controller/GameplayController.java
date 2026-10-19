package com.mycompany.jogo.controller;

import com.mycompany.jogo.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class GameplayController {

    @FXML
    private Label dias;
    
    @FXML
    private Label moedin;
    
    private int moedas = 0;

    @FXML
    private void prepararPedido() {
        moedas += 10;
        moedin.setText("Moedas: " + moedas);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setContentText("Pedido entregue, é isso aí! +10 moedas.");
        alerta.showAndWait();
    }

    @FXML
    private void finalizarTurno() throws IOException {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setContentText("Turno finalizado! Voce ganhou " + moedas + " moedas.");
        alerta.showAndWait();
        App.setRoot("view/Upgrades");
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("view/MenuPrincipal");
    }
}