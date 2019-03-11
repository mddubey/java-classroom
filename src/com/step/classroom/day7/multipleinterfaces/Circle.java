package com.step.classroom.day7.multipleinterfaces;

public class Circle implements Drawable, Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void draw(int penWidth) {
        System.out.println("Drawing Circle with pen width" + penWidth);
    }
}
