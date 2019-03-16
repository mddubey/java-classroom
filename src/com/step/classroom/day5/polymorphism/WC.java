package com.step.classroom.day5.polymorphism;

public class WC {
    private Reader reader;
    private final Writer writer;

    public WC(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public long readBytes() {
        return reader.read().length();
    }

    public void writeBytes(String content){
        writer.write(content);
    }
}
