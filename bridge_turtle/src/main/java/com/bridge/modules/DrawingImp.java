package com.bridge.modules;

public class DrawingImp implements DrawingItf {
    public void drawImage(String image) {
        System.out.println("Java 2D 畫 " + image);
    }
    public void drawLine() {
        System.out.println("Java 2D 畫線 ");
    }
    public void turnImage(String image) {
        System.out.println("Java 2D 轉 " + image);
    }
    public void rotateImage(String image) {
        System.out.println("Java 2D 翻 " + image);
    }
}