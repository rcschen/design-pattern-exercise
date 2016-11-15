package com.bridge;
import com.bridge.context.TurtleItf;
import com.bridge.context.TurtleImp;
import com.bridge.modules.DrawingImp;
public class Main {
    public static void main(String[] args) {
        TurtleItf turtle = new TurtleImp(new DrawingImp());
        turtle.move();
        turtle.turn();
    }
}