package com.trafficlight.context;

import com.trafficlight.state.StateItf;
import com.trafficlight.state.lightImp.RedLight;

public class TrafficLight {
    private StateItf current = new RedLight();
    public void set(StateItf state) {
        this.current = state;
    }
    public void change() {
        current.change(this);
    }
}