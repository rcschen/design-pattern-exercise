package com.trafficlight;
import com.trafficlight.context.TrafficLight;
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        while(true) {
            trafficLight.change();
        }
    }
}