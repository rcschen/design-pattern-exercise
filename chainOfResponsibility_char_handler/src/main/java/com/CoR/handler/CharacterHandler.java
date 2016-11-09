package com.CoR.handler;

public class CharacterHandler extends HandlerAbs {
    public CharacterHandler(HandlerAbs next) {
        super(next);
    }    
    public void handle(char c) {
        if(Character.isLetter(c)) {
            System.out.println("Character has been handled"); 
        }
        doNext(c);
    }
}
