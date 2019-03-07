package com.step.classroom.day4;

public class Employee extends Person{
    private int empId;
    private String designation;
    private int salary;

    public Employee(String name, String address, int age, char gender, int height, int empId, String designation, int salary) {
        super(name, address, age, gender, height);
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public void eat() {
        System.out.println("Need to eat fast to go back to work!");

    }


    public void work(){
        System.out.println("Working..");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
