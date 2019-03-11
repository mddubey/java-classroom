package com.step.classroom.day5.polymorphism.shapes;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return 3*this.radius*this.radius;
    }

    @Override
    public int getPerimeter() {
        return 6*this.radius;
    }
}
