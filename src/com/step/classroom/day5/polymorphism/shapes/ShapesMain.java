package com.step.classroom.day5.polymorphism.shapes;

public class ShapesMain {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(2, 3);
        Circle circle = new Circle(5);
        shapes[0] = rect1;
        shapes[1] = rect2;
        shapes[2] = circle;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
        }
    }
}
