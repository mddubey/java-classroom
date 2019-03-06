package com.step.classroom.day3;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Text:");

        //reading till first whitespace
//        System.out.println(scanner.next());

        //reading a line
//        System.out.println(scanner.nextLine());

        // read until the Standard Input is closed
//        while (true) {
//            String line = scanner.nextLine();
//            System.out.println(line);
//        }

        //reading 10 lines
//        for (int i = 0; i < 10; i++) {
//            String line = scanner.nextLine();
//            System.out.println(line);
//        }

        //reading until 'q' is entered
//        String line;
//        do {
//            line = scanner.nextLine();
//            System.out.println(line);
//        }while (!line.equals("q"));

        //reading integers
//        int i = scanner.nextInt();
//        int j = scanner.nextInt();
//        System.out.println(i);
//        System.out.println(j);

        //reading boolean
//        boolean b = scanner.nextBoolean();
//        System.out.println(b);

        //reading all the integers ignoring anything else
//        while (scanner.hasNext()) {
//            if (scanner.hasNextInt()) {
//                int next = scanner.nextInt();
//                System.out.println(next);
//            }
//        }

        int i = scanner.nextInt();
//        scanner.nextLine();
        System.out.println(i);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }
}
