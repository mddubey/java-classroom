package com.step.classroom.day3;

public class Intern {
    private int empId;
    private String name;
    private int stipend;
    private int batchNumber;
    private String bloodGroup;

    public Intern() {
        this(999, "Default Intern", 1000, -1, "z");
    }

    public Intern(int empId, String name, int stipend, int batchNumber, String bloodGroup) {
        this.empId = empId;
        this.name = name;
        this.stipend = stipend;
        this.batchNumber = batchNumber;
        this.bloodGroup = bloodGroup;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 2) {
            return;
        }
        this.name = name;
    }

    public int getStipend() {
        return stipend;
    }

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
