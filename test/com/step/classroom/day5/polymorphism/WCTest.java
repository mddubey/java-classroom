package com.step.classroom.day5.polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MockReader implements Reader {
    @Override
    public String read() {
        return "This is test text";
    }
}

class MockWriter extends Writer {
    String content = "";

    @Override
    public void write(String content) {
        this.content = content;
    }
}

class WCTest {

    @Test
    void shouldGiveNumberOfCharacters() {
        String s = "This is test text";
        WC wc = new WC(new MockReader(), null);

        assertEquals(s.length(), wc.readBytes());
    }

    @Test
    void shouldWriteContentsToGivenWriter() {
        String s = "This is test text";
        MockWriter writer = new MockWriter();

        WC wc = new WC(null, writer);

        wc.writeBytes(s);
        assertEquals(writer.content, s);
    }
}