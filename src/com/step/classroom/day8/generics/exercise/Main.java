package com.step.classroom.day8.generics.exercise;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        CricketTeam indXiC = new CricketTeam("IND XI C", 1, 2, 3);
        CricketTeam ausXiC = new CricketTeam("AUS XI C", 2, 2, 0);
        CricketTeam rsaXiC = new CricketTeam("RSA XI C", 1, 1, 1);


        Leauge<CricketTeam> cricketTeamLeauge = new Leauge<>(asList(indXiC, ausXiC, rsaXiC));
        cricketTeamLeauge.showLeaderBoard();

        System.out.println("***************************");
        FootbalTeam indXiF = new FootbalTeam("IND XI F", 1, 2, 3);
        FootbalTeam ausXiF = new FootbalTeam("AUS XI F", 2, 2, 0);
        FootbalTeam rsaXiF = new FootbalTeam("RSA XI F", 1, 1, 1);


        Leauge<FootbalTeam> footbalTeamLeauge = new Leauge<>(asList(indXiF, ausXiF, rsaXiF));
        footbalTeamLeauge.showLeaderBoard();
    }
}
