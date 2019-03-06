package com.step.classroom.day1;

public class Main {
    public static void main(String[] args) {
        // No need to import if Class is part of same package
        long milesPerHour = SpeedConverter.toMilesPerHour(1.5);
        System.out.println(milesPerHour);
    }
}
