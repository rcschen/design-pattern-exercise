package com.SimpleFactory.implementation;

import com.SimpleFactory.abs.Shape;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("circle factory: circle");        
    }
}
