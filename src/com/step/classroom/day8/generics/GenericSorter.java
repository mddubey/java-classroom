package com.step.classroom.day8.generics;

import java.util.Arrays;

public class GenericSorter<T> {
    private T[] elements;

    public GenericSorter(T[] elements) {
        this.elements = elements;
    }

    public void sort(){
        Arrays.sort(elements);
    }

    public void display(){
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
