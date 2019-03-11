package com.step.classroom.day7.abstractclasses;

public class Car extends Vehicle{
    @Override
    public void accelerate() {
        super.speed += 2;
    }
}
