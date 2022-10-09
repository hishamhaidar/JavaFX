package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    public Circle myCircle;
    private double x,y;
    public void up(ActionEvent e)
    {
       // System.out.println("UP");
        myCircle.setCenterY(y-=10);
    }

    public void bottom(ActionEvent e)
    {
        //System.out.println("bottom");
        myCircle.setCenterY(y+=10);
    }

    public void right(ActionEvent e)
    {
        //System.out.println("right");
        myCircle.setCenterX(x+=10);
    }

    public void left(ActionEvent e)
    {
        //System.out.println("left");
        myCircle.setCenterX(x-=10);
    }

}