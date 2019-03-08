package com.step.classroom.day5;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateVolume() {
        return this.base.getArea() * height;
    }
}
