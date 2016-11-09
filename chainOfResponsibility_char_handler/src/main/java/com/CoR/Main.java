package com.CoR;
import com.CoR.handler.HandlerAbs;
import com.CoR.handler.SymbolHandler;
import com.CoR.handler.CharacterHandler;
import com.CoR.handler.DigitHandler;

public class Main {
    public static void main(String[] args) {
        HandlerAbs handler = new SymbolHandler(
                            new CharacterHandler(
                              new DigitHandler(null)));
        handler.handle('A');
        System.out.println("----------");
        handler.handle('1');
    }
}