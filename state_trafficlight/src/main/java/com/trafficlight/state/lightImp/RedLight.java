package com.trafficlight.state.lightImp;
import com.trafficlight.context.TrafficLight;

public class RedLight extends LightAbs {
    public void change(TrafficLight light) {
        System.out.println("���O");
        sleep(5000);
        light.set(new GreenLight()); // �p�G�Ҽ{�u�ʽվ㪬�A�A�i�H���μg�����A����]�w
    }
}
