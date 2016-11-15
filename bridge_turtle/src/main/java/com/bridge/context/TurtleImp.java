package com.bridge.context;
import com.bridge.modules.DrawingItf;;
public class TurtleImp implements TurtleItf {
    private String image = "Duke";
    private DrawingItf drawing;
    
    public TurtleImp(DrawingItf drawing) {
        this.drawing = drawing;
    }
    
    public void move() {
        System.out.println("計算出目的地位置");
        drawing.drawImage(image);
        drawing.drawLine();
    }
    public void turn() {
        drawing.rotateImage(image);
        drawing.drawImage(image);
    }    
}