package com.step.classroom.day4;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aftab", "1st lane", 21, 'M',9);

        Employee employee = new Employee("Aftab", "1st lane", 21, 'M', 9, 12345, "Intern", 12345);

        Intern intern = new Intern("Aftab", "1st lane", 21, 'M', 9, 12345);
        Intern intern1 = intern;

        person.eat();
        person.sleep();

        employee.eat();
        employee.sleep();
        employee.work();

        intern.eat();
        intern.work();
        intern.printHeight();
    }
}
