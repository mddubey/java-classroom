package com.step.classroom.day6.previousdayexercise;

public class HealthyBurger extends Hamburger {
    private boolean hasVeg;
    private boolean hasOats;

    public HealthyBurger(String meat, double basePrice) {
        super("brown rye bread roll", meat, basePrice);
    }

    public void addOats() {
        this.hasOats = true;
        this.totalPrice += 99;
    }

    public void addVeg() {
        this.hasVeg = true;
        this.totalPrice += 25;
    }
}
