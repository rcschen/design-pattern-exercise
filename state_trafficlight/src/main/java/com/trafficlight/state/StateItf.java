package com.trafficlight.state;

import com.trafficlight.context.TrafficLight;

public interface StateItf {
    public void change(TrafficLight light);
}