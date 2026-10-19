package com.mycompany.jogo.controller;

import com.mycompany.jogo.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class CreditosController {

    @FXML
    private void voltar() throws IOException {
        App.setRoot("view/MenuPrincipal");
    }
}