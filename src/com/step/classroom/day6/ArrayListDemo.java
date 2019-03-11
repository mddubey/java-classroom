package com.step.classroom.day6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 12);
        }
        numbers.add(72);
        System.out.println(numbers);
        numbers.add(2, 243);
//        numbers.set(2, 23);
        System.out.println(numbers);
    }
}
