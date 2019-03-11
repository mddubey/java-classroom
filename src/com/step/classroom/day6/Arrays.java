package com.step.classroom.day6;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 12;
        numbers[1] = 13;

        int[] otherNumbers = new int[5 + 1];
        for (int i = 0; i < numbers.length; i++) {
            otherNumbers[i] = numbers[i];
        }
        otherNumbers[5] = 12;

        for (int i = 0; i < otherNumbers.length; i++) {
            System.out.println(otherNumbers[i]);
        }
    }
}
