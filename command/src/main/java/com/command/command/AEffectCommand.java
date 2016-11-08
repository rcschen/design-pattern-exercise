package com.command.command;

import com.command.draw.DrawingItf;;

public class AEffectCommand implements CommandItf {
	
    public void execute(DrawingItf drawing) {
        System.out.println("作 A 特效");
        drawing.processSome();
        drawing.processOther();
    }
}

