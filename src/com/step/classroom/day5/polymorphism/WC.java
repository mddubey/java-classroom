package com.step.classroom.day5.polymorphism;

public class WC {
    private Reader reader;

    public WC(Reader reader) {
        this.reader = reader;
    }

    public long readBytes() {
        return reader.read().length();
    }
}
