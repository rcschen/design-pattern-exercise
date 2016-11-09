package com.trafficlight.state.lightImp;
import com.trafficlight.state.StateItf;
import com.trafficlight.context.TrafficLight;

abstract class LightAbs implements StateItf {
    public abstract void change(TrafficLight light);
    protected void sleep(int second) {
        try {
            Thread.sleep(second);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}