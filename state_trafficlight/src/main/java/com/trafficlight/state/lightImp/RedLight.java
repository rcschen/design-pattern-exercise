package com.trafficlight.state.lightImp;
import com.trafficlight.context.TrafficLight;

public class RedLight extends LightAbs {
    public void change(TrafficLight light) {
        System.out.println("紅燈");
        sleep(5000);
        light.set(new GreenLight()); // 如果考慮彈性調整狀態，可以不用寫死狀態物件設定
    }
}
