package com.step.classroom.day5.polymorphism;


/*
Demonstrate polymorphism usecase designing a WC program independent of concrete implementation of reader
* */
public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.read();

        Reader reader1 = new FileReader();
        reader1.read();

        Reader reader2 = new StreamReader();
        reader2.read();
    }
}
