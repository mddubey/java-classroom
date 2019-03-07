package com.step.classroom.day4;

public class Person {
    private String name;
    private String address;
    private int age;
    private char gender;
    protected int height;

    public Person(String name, String address, int age, char gender, int height) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    protected void walk(){
        System.out.println("Walking...");
    }
}
