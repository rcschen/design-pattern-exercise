package com.bridge.modules;

public class DrawingImp implements DrawingItf {
    public void drawImage(String image) {
        System.out.println("Java 2D �e " + image);
    }
    public void drawLine() {
        System.out.println("Java 2D �e�u ");
    }
    public void turnImage(String image) {
        System.out.println("Java 2D �� " + image);
    }
    public void rotateImage(String image) {
        System.out.println("Java 2D ½ " + image);
    }
}