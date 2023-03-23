package com.example.itgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label menoPriezvisko;

    @FXML
    private TextField prveTextovePole;

    public void initialize(){
        System.out.println(menoPriezvisko.getText());
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Toto je moja GUI Aplikácia");
    }

    @FXML
    protected void zobrazPole() {
        System.out.println("test tlačidla");
    }
}