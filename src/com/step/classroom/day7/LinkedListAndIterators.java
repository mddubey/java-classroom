package com.step.classroom.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListAndIterators {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            if (i == 0) {
                numbers.remove(new Integer(2));
            }
        }

        System.out.println("List Iterator");
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            Integer next = listIterator.next();
            System.out.println(next);
            if (next == 1){
                numbers.remove(new Integer(1));
            }
        }

        System.out.println("Iterator");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
            if (next == 1){
                numbers.remove(new Integer(1));
            }
        }
    }
}
