package com.step.classroom.day8.generics.exercise;

public class FootbalTeam extends Team {

    public FootbalTeam(String name, int won, int lost, int draw) {
        super(name, won, lost, draw);
    }

    @Override
    public int calculatePoints() {
        return super.getWon() + super.getLost() * -2;
    }
}
