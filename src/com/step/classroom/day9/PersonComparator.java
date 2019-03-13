package com.step.classroom.day9;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAccBalance() - o2.getAccBalance();
    }
}
