package com.step.classroom.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void shouldCalculateAreaOfCylinder() {
        double radius = 10;
        double height = 5.0;
        Circle circle = new Circle(radius);
        Cylinder cylinder = new Cylinder(circle, height);

        assertEquals(1570, Math.round(cylinder.calculateVolume()), 1);
    }
}