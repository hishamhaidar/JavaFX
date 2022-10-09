package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public void start(Stage stage) {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            Scene scene = new Scene(root);

            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            String css = this.getClass().getResource("application.css").toExternalForm();

            scene.getStylesheets().add(css);

            stage.setScene(scene);

            stage.show();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

        public static void main(String[] args) {
        // launch the application.start method is called
        launch(args);
    }
}