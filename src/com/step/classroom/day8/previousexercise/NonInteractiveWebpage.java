package com.step.classroom.day8.previousexercise;

public class NonInteractiveWebpage implements Displayable, Printable {

    @Override
    public void display(String content) {
        System.out.println("Non Interactive display " + content);
    }

    @Override
    public String getPrintableContent() {
        return "Content from Non Interactive Webpage";
    }
}
