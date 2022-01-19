package com.codewars.utils;

public class ConsoleScanner implements Scanner{
    java.util.Scanner sc = new java.util.Scanner(System.in);

    @Override
    public int readInt() {
        while(true) {
            System.out.print("Input integer number: ");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Bad integer number! Try again.");
            }
        }
    }

    @Override
    public String readString() {
        while(true) {
            System.out.print("Input string: ");
            if (sc.hasNext()) {
                return sc.next();
            } else {
                System.out.println("Bad string! Try again.");
            }
        }
    }
}
