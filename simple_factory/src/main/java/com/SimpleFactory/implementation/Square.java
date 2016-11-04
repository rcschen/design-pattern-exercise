package com.SimpleFactory.implementation;

import com.SimpleFactory.abs.Shape;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("square factory : quare");
    }
}