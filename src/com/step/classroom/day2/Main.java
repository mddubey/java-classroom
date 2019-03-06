package com.step.classroom.day2;

import com.step.classroom.day1.SpeedConverter;

public class Main {
    public static void main(String[] args) {
        //Need to import Class when it is part of different package
        long milesPerHour = SpeedConverter.toMilesPerHour(1.5);
        System.out.println(milesPerHour);
    }
}
