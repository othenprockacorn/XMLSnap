package com.acorn.xmlsnap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource(GlobalSettings.MAIN_VIEW));
        Scene scene = new Scene(fxmlLoader.load(), 1024,768);
        scene.getStylesheets().add(Objects.requireNonNull(this.getClass().getResource(GlobalSettings.MAIN_CSS)).toExternalForm());

        stage.setMinHeight(768);
        stage.setMinWidth(1024);
        stage.setTitle(GlobalSettings.APP_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}