package com.step.classroom.day4;

public class Intern extends Employee {
    public Intern(String name, String address, int age, char gender, int height, int empId) {
        super(name, address, age, gender, height, empId, "Intern", 100000);
    }

    @Override
    public void eat() {
        System.out.println("Not that important, let me finish coding!");
    }

    @Override
    public void work() {
        System.out.println("Learning and Coding");
    }

    void printHeight(){
        System.out.println("Can access protected of grand parent " + super.height);
    }


}
