package com.trafficlight.state.lightImp;

import com.trafficlight.context.TrafficLight;


public class GreenLight extends LightAbs {
    public void change(TrafficLight light) {
        System.out.println("ºñ¿O");
        sleep(5000);
        light.set(new YellowLight());
    }
}
