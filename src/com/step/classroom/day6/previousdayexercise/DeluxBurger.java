package com.step.classroom.day6.previousdayexercise;

public class DeluxBurger extends Hamburger {
    protected boolean hasDrinks;
    private boolean hasChips;

    public DeluxBurger(String breadRollType, String meat, double basePrice) {
        super(breadRollType, meat, basePrice);
        this.hasChips = true;
        this.hasDrinks = true;
    }

    @Override
    public void addCarrot() {
        System.out.println("You cannot add Carrot");
    }

    @Override
    public void addTomato() {
        System.out.println("You cannot add Tomato");
    }

    @Override
    public void addLettuce() {
        System.out.println("You cannot add Lettuce");
    }

    @Override
    public void addOnion() {
        System.out.println("You cannot add Onion");
    }
}
