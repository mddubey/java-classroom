package com.step.classroom.day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeedConverterTest {
    @Test
    @DisplayName("Gives -1 when passed a negative kms")
    void shouldNotConvertInvalidKms() {
        long milesPerHour = SpeedConverter.toMilesPerHour(-9);
        assertEquals(-1, milesPerHour);
    }

    @Test
    void shouldConvertKmsToMiles() {
        long milesPerHour = SpeedConverter.toMilesPerHour(1.5);
        assertEquals(1, milesPerHour);
    }

}