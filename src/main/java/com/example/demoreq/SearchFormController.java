package com.example.demoreq;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchFormController {
    public static void newWindow (String str ) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Search-view.fxml"));
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 720, 240);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.setTitle(str);
        window.setScene(scene);
        window.show();
    }
}
