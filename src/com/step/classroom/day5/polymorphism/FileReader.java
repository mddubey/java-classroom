package com.step.classroom.day5.polymorphism;

public class FileReader implements Reader{
    @Override
    public String read() {
        return "Reading from File";
    }
}
