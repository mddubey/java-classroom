package com.step.classroom.day5.polymorphism.shapes;

public class Rectangle implements Shape {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int getArea() {
        return this.breadth * this.length;
    }

    @Override
    public int getPerimeter() {
        return 2 * (this.breadth + this.length);
    }
}
