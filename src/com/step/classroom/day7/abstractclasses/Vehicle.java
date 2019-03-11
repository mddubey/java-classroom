package com.step.classroom.day7.abstractclasses;

public abstract class Vehicle {
    protected int speed;

    public void stop(){
        speed = 0;
    }

    public abstract void accelerate();
}
