package com.step.classroom.day8.generics.exercise;

public class CricketTeam extends Team {

    public CricketTeam(String name, int won, int lost, int draw) {
        super(name, won, lost, draw);
    }

    @Override
    public int calculatePoints() {
        return super.getWon() * 2 + super.getDraw();
    }
}
