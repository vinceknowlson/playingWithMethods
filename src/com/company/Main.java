package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many matchstick houses would you like?");
        int matchNum = matches(input.nextInt());
        System.out.println("To build this many houses you would need " + matchNum + " houses");

    }

    private static int matches(int matchHouse) {
        int matchNum = ((matchHouse * 5) + 1);
        return matchNum;
    }
}