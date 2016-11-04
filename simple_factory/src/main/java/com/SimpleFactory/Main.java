package com.SimpleFactory;

import com.SimpleFactory.SimpleFactory;

public class Main {
    public static void main(String args[]) {
        SimpleFactory.createProduct("circle").draw();
        SimpleFactory.createProduct("square").draw();
    }
}