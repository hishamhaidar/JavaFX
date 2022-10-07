package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
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
    @Override
    public void start(Stage primarystage) throws IOException {
        // our main root node
        Group root = new Group();
        // creating scene to add it for the stage . you can also give background color
        Scene scene= new Scene(root,600,600,Color.LIGHTSKYBLUE);
        Stage stage = new Stage();
        // create a text
        Text text = new Text();
        text.setText("Hey");
        text.setFont(Font.font("Verdana",50));
        // coordinates on the app
        text.setX(50); text.setY(50);
        //text color
        text.setFill(Color.LIMEGREEN);
        //create line
        Line line = new Line();
        // set start and end of line
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(500);
        line.setEndY(100);
        // change its width , color, opacity
        line.setStrokeWidth(5);
        line.setStroke(Color.YELLOW);
        line.setOpacity(3);

        //rotating
        line.setRotate(45);

        // Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        //
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.RED);
        // triangle
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.LIMEGREEN);

        //circle
        Circle circle= new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        // Add image
        Image image = new Image("bear.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        // We need to add them to appear
        root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // launch the application.start method is called
        launch(args);
    }
}