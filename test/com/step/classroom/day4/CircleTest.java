package com.step.classroom.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldReturnAreaOfCircle() {
        Circle circle = new Circle(3.75);
        assertEquals(44.178646691106465, circle.getArea());
    }
}