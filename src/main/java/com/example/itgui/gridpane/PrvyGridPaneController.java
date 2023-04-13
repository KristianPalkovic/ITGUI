package com.example.itgui.gridpane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class PrvyGridPaneController {
    @FXML
    private Label loginText;

    @FXML
    private TextField pole;

    @FXML
    private PasswordField password;


    private Map<String,String> passwordStore = new HashMap<>();
    {
        passwordStore.put("john","123");
        passwordStore.put("marry","456");
    }
    @FXML
    public void process(){
        if (){
            System.out.println(passwordStore.get("john"));
        }else{
            System.out.println("Neplatné zadanie mena alebo hesla");
        }
    }
}