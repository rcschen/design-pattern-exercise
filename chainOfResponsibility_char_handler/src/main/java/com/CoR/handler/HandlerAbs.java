package com.CoR.handler;

public abstract class HandlerAbs {
    protected HandlerAbs next;
    public HandlerAbs(HandlerAbs next) {
        this.next = next;
    }    
    void doNext(char c) {
        if(next != null) {
           next.handle(c);
        }
    }
    public abstract void handle(char c);
}
