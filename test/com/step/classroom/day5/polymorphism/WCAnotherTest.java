package com.step.classroom.day5.polymorphism;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WCAnotherTest {

    @Test
    void shouldGiveContentLength() {
        String mock = Mockito.mock(String.class);
        Reader reader = Mockito.mock(Reader.class);

        String content = "Some content";
        Mockito.when(reader.read()).thenReturn(content);

        WC wc = new WC(reader, null);
        assertEquals(content.length(), wc.readBytes());
    }

    @Test
    void shouldWriteGivenContent() {
        Writer writer = Mockito.mock(Writer.class);

        String content = "Some content";

        WC wc = new WC(null, writer);
        wc.writeBytes(content);

        Mockito.verify(writer, Mockito.times(1)).write(content);
    }
}