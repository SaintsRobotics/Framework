package com.saintsrobotics.framework.output;

import java.util.ArrayList;
import java.util.List;

public abstract class Motors {
    
    
    private List<Motor> motorList = new ArrayList<>();
    
    public void init() {
        motorList.forEach(Motor::init);
    }
    
    public void stopAll() {
        motorList.forEach(Motor::stop);
    }
    
    public void update() {
        motorList.forEach(Motor::update);
    }
    
}
