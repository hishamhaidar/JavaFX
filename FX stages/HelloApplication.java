package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // our main root node
        Group root = new Group();
        // creating scene to add it for the stage . you can also give background color
        Scene scene= new Scene(root, Color.BLACK);
        stage.setTitle("My first JavaFX");
        // wanna change my icon
        Image Bearicon = new Image("bear.jpg");
        stage.getIcons().add(Bearicon);
        //if we wanna put width,height
        stage.setWidth(420);
        stage.setHeight(420);
        // if we wanna stop resizing
        //stage.setResizable(false);
        // if we wanna make stage appear at specific x- y coordinates
        //stage.setX();stage.setY();
        // full screen?
        stage.setFullScreen(true);
        // hint to exit?
        stage.setFullScreenExitHint("hey");
        //putting custom key to escape?
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        //add scene to stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // launch the application.start method is called
        launch(args);
    }
}