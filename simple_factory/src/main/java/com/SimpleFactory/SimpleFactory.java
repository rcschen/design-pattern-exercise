package com.SimpleFactory;
import com.SimpleFactory.implementation.Circle;
import com.SimpleFactory.implementation.Square;
import com.SimpleFactory.abs.Shape;

public class SimpleFactory {
    public static Shape createProduct(String product) {
        if(product.equals("circle")){
            return new Circle();
        }else if(product.equals("square")){
            return new Square();
        }else {
            System.out.println("no such a product");
            return null;
        }
    }
}