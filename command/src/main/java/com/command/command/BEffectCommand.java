package com.command.command;

import com.command.draw.DrawingItf;;



public class BEffectCommand implements CommandItf {
    public void execute(DrawingItf drawing) {
        System.out.println("作 B 特效");
        drawing.processOther();
        drawing.processAnother();
    }
}

