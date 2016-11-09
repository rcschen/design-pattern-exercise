package com.trafficlight.state.lightImp;
import java.lang.Thread;
import com.trafficlight.context.TrafficLight;

public class YellowLight extends LightAbs {
    public void change(TrafficLight light) {
        System.out.println("¶À¿O");
        sleep(1000);
        light.set(new RedLight());
    }
}