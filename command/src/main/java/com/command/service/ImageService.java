package com.command.service;
import java.util.HashMap;
import java.util.Map;
import com.command.draw.DrawingItf;
import com.command.draw.DrawingImpl;
import com.command.command.CommandItf;


public class ImageService {
    private Map<String, CommandItf> commands = new HashMap<String, CommandItf>();
    private DrawingItf drawing = new DrawingImpl();
    public void addCommand(String effect, CommandItf command) {
        commands.put(effect, command);
    }
    public void doEffect(String effect) {
        commands.get(effect).execute(drawing);
    }
}