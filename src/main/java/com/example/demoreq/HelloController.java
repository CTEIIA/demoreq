package com.example.demoreq;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        SecondClass.newWindow("Privet");

    }
        @FXML
    protected void onCloneMenuClic(){
        GitCloneFx.newWindow("Clone");
        }
        @FXML
        protected void onSettingsMenuClic(){
            SettingsFormFX.newWindow("Settings");
        }

    @FXML
    protected void onSearchClic(){
        SearchFormController.newWindow("Search");
    }

}