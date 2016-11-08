package com.command.command;

import com.command.draw.DrawingItf;;


public class CEffectCommand implements CommandItf {
    public void execute(DrawingItf drawing) {
        System.out.println("作 C 特效");
        drawing.processOther();
        drawing.processSome();
        drawing.processAnother();
    }
}