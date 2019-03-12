package com.step.classroom.day8.generics;

public class Main {
    public static void main(String[] args) {
//        sorterUses();
        GenericSorter<Integer> sorter = new GenericSorter<>(new Integer[]{23, 1, 12});
        sorter.sort();
        sorter.display();
    }

    private static void sorterUses() {
        Sorter sorter = new Sorter(new Integer[]{11, 24, 3});
        sorter.sort();
        sorter.display();

        sorter = new Sorter(new String[]{"ram", "shyam", "mohan"});
        sorter.sort();
        sorter.display();

        sorter = new Sorter(new Object[]{11, "2", Boolean.TRUE});
        sorter.sort();
        sorter.display();
    }
}
