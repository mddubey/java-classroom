package com.step.classroom.day5;

import com.step.classroom.day4.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldReturnAreaOfCircle() {
        com.step.classroom.day4.Circle circle = new Circle(3.75);
        assertEquals(44.178646691106465, circle.getArea());
    }
}