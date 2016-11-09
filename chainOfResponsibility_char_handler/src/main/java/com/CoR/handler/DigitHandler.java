package com.CoR.handler;

public class DigitHandler extends HandlerAbs {
    public DigitHandler(HandlerAbs next) {
        super(next);
    }    
    public void handle(char c) { 
       if(Character.isDigit(c)) {
            System.out.println("Digit has been handled"); 
       }
       doNext(c);
    }
}
