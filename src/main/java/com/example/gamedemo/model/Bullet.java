package com.example.gamedemo.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Bullet {

    private Canvas canvas;
    private GraphicsContext gc;
    public int x,y;

    public Bullet(Canvas canvas, int x, int y){
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
        this.x = x;
        this.y = y;
    }
    public void draw(){
        gc.setFill(Color.YELLOW);
        gc.fillOval(x-5,y-5, 10,10);
        x+=5;
    }


}
