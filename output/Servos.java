package com.saintsrobotics.framework.output;

import edu.wpi.first.wpilibj.Servo;

import java.util.ArrayList;
import java.util.List;

public abstract class Servos {
    
    private List<ServoWrapper> servos = new ArrayList<>();

    public void init() {
        servos.forEach(ServoWrapper::init);
    }

    public static class ServoWrapper {

        private final int pin;
        private Servo servo;

        ServoWrapper(int pin) {
            this.pin = pin;
        }

        void init() {
            if (pin != -1) {
                servo = new Servo(pin);
            }
        }

        public void setAngle(double degrees) {
            if (pin != -1) {
                servo.setAngle(degrees);
            }
        }
    }
}
