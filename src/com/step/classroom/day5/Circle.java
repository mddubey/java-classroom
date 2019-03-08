package com.step.classroom.day5;

/*
* Demonstrating the circle and cylinder challenge  with composition(done a day before with inheritance)
*
* */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}