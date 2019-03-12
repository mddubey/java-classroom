package com.step.classroom.day8.generics.exercise;

public abstract class Team<T extends Team> {
    private String name;
    private int won;
    private int lost;
    private int draw;

    public Team(String name, int won, int lost, int draw) {
        this.name = name;
        this.won = won;
        this.lost = lost;
        this.draw = draw;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getDraw() {
        return draw;
    }

    public int compareWithOtherTeam(T otherTeam) {
        int myPoints = this.calculatePoints();
        int oppositionPoints = otherTeam.calculatePoints();
        return myPoints - oppositionPoints;

//        if (myPoints > oppositionPoints) {
//            return 1;
//        }
//        if (myPoints < oppositionPoints) {
//            return -1;
//        }
//        return 0;
    }

    protected abstract int calculatePoints();

    public String getName() {
        return name;
    }
}
