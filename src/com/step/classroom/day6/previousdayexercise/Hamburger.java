package com.step.classroom.day6.previousdayexercise;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasCarrot;
    private boolean hasOnion;
    private double basePrice;
    protected double totalPrice;

    public Hamburger(String breadRollType, String meat, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.totalPrice = basePrice;
    }
    public void addCarrot(){
        this.hasCarrot  =true;
        this.totalPrice += 50;
    }

    public void addTomato(){
        this.hasTomato  =true;
        this.totalPrice += 100;
    }

    public void addLettuce(){
        this.hasLettuce  =true;
        this.totalPrice += 150;
    }

    public void addOnion(){
        this.hasOnion  =true;
        this.totalPrice += 200;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }


}

