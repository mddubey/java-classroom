package com.step.classroom.day9;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Person, Integer> personAccBalanceMap = new HashMap<>();

        Person ram = new Person("Ram", 10);
        personAccBalanceMap.put(ram, 123);
        System.out.println(ram.hashCode());
        ram.setName("Rama");
        System.out.println(ram.hashCode());
        Integer integer = personAccBalanceMap.get(ram);
        System.out.println(integer);

    }
    
}
