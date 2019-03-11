package com.step.classroom.day7.multipleinterfaces;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(2);

        Drawable drawable = new Circle();
        drawable.draw();

        System.out.println(shape);
    }
}
