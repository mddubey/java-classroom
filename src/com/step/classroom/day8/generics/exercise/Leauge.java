package com.step.classroom.day8.generics.exercise;

import java.util.Comparator;
import java.util.List;

public class Leauge<T extends Team> {
    private List<T> teams;

    public void add(T team){
        teams.add(team);
    }

    public Leauge(List<T> teams) {
        this.teams = teams;
    }

    public void showLeaderBoard() {
       teams.sort(new Comparator<T>() {
           @Override
           public int compare(T o1, T o2) {
               return o2.compareWithOtherTeam(o1);
           }
       });

        teams.sort(new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                return 0;
            }
        });

        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }
}
