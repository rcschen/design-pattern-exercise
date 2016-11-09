package com.CoR.handler;


public class SymbolHandler extends HandlerAbs {
    public SymbolHandler(HandlerAbs next) {
        super(next);
    }
    public void handle(char c) {
        System.out.println("Symbol has been handled");
        doNext(c);
    }
}