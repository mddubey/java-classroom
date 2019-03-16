package com.step.classroom.day5.polymorphism;

public class StreamReader implements Reader {
    @Override
    public String read() {
        return "Reading from Stream";
    }
}
