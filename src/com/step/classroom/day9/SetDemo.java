package com.step.classroom.day9;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class SetDemo {

    public static <T> Set<T> union(Set<T> firstSet, Set<T> secondSet) {
        HashSet<T> result = new HashSet<>(firstSet);
        result.addAll(secondSet);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> firstSet, Set<T> secondSet) {
        Set<T> result = new HashSet<>(firstSet);
        result.retainAll(secondSet);
        return result;
    }

    public static <T> Set<T> difference(Set<T> firstSet, Set<T> secondSet) {
        HashSet<T> result = new HashSet<>(firstSet);
        result.removeAll(secondSet);
        return result;
    }


    public static void main(String[] args) {
//        Set<String> stringSet = new HashSet<>();
//        stringSet.add("Delhi");
//        stringSet.add("Bangalore");
//        stringSet.add("Amritsar");
//        stringSet.add("Dehradun");
//        stringSet.add("Gurgaon");
//        stringSet.add("Hyderabad");
//        stringSet.add("Kolkata");
//        stringSet.add("Dehradun");
//
//        System.out.println(stringSet);

//        Set<Person> people = new HashSet<>();
//
//        people.add(new Person("Ram",12));
//        people.add(new Person("Shyam",23));
//        people.add(new Person("Suraj",21));
//        people.add(new Person("Ram",12));
//
//
//
//        System.out.println(people);


        HashSet<Integer> firstSet = new HashSet<>(asList(12, 34, 56, 21, 87));
        HashSet<Integer> secondSet = new HashSet<>(asList(23, 87, 34, 67, 56));

//        HashSet<Integer> firstSet = new HashSet<>(asList(1, 2, 3, 4));
//        HashSet<Integer> secondSet = new HashSet<>(asList(2, 3, 4, 5));

        System.out.println(union(firstSet, secondSet));
        System.out.println(intersection(firstSet, secondSet));
        System.out.println(difference(firstSet, secondSet));
        System.out.println(difference(secondSet, firstSet));
    }
}
