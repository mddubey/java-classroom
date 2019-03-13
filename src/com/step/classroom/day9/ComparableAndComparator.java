package com.step.classroom.day9;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class ComparableAndComparator {
    public static void main(String[] args) {
        Person keerthy = new Person("Keerthy", 1000);
        Person dheeraj = new Person("Dheeraj", 400);
        Person shubham = new Person("Shubham", 876);
        Person ankon = new Person("Ankon", 412);

        List<Person> people = asList(keerthy, dheeraj, shubham, ankon);
        System.out.println(people);

        Collections.sort(people);
        System.out.println(people);

        Collections.sort(people, new PersonComparator());
        System.out.println(people);

    }
}
