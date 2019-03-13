package com.step.classroom.day9;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int accBalance;

    public Person(String name, int accBalance) {
        this.name = name;
        this.accBalance = accBalance;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return accBalance == person.accBalance &&
                name.equals(person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, accBalance);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    public int getAccBalance() {
        return accBalance;
    }
}
