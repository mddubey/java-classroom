package com.step.classroom.day2;

public class MethodOverloading {
    public static void main(String[] args) {
        int i = calculateArea(1);
        double v = calculateArea(4.5F);
        int area = calculateArea(1, 3);


        calculateScore("gaurav", 1);
        calculateScore(1, "gaurav");

        initPlayer("Chandan", 21);


        //Be explicit to call the method with parameter as long
        printDistance(10000L);

        //ambigious call
        sum(1, 2L);
    }

    public static long sum(int a, long b) {
        return a + b;
    }

    public static long sum(long a, int b) {
        return a + b;
    }

    public static void printDistance(long distance) {
        System.out.println("Distance in integer " + distance);
    }

    public static void printDistance(int distance) {
        System.out.println("Distance in long " + distance);
    }

    public static void initPlayer(String name, int Age, String passportNumber) {
        //
    }

    //Overloaded method for optional parameters
    public static void initPlayer(String name, int Age) {
        //
    }

    //overloaded addition of intergers
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void calculateScore(String playerName, int score) {
        System.out.println("Name First Param " + playerName + " And Score Second Param " + score);
    }

    public static void calculateScore(int score, String playerName) {
        System.out.println("Name Second Param " + playerName + " And Score First Param " + score);
    }

    public static int calculateArea(int s) {
        return s * s;
    }

    public static int calculateArea(int l, int b) {
        return l * b;
    }

    public static double calculateArea(float r) {
        return 3.14 * r * r;
    }
}
