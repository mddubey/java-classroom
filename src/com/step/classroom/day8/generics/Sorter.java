package com.step.classroom.day8.generics;

import java.util.Arrays;

//Given two integers it should add them
//Given two string it should concatinate them
public class Sorter {
    private Object[] objects;

    public Sorter(Object[] objects) {
        this.objects = objects;
    }

    public void sort() {
        Arrays.sort(objects);
    }

    public void display() {
        System.out.println(objects);
    }
}
