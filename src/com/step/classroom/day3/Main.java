package com.step.classroom.day3;

public class Main {
    public static void main(String[] args) {
        Intern intern = new Intern();

        intern.setEmpId(1);
        intern.setName("ab");
        intern.setBatchNumber(6);
        intern.setBloodGroup("A+");
        intern.setStipend(100000);

        String stringRepOfIntern = intern.toString();
        System.out.println(stringRepOfIntern);

        System.out.println(intern.getEmpId());
        System.out.println(intern.getName());

    }
}
