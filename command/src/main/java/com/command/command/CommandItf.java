package com.command.command;

import com.command.draw.DrawingItf;

public interface CommandItf {
   void execute(DrawingItf drawing);
}