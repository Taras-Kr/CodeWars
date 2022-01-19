package com.codewars;

import com.codewars.implementation.EigthImpl;
import com.codewars.utils.ConsoleScanner;

import java.util.Scanner;

public class MainAppl {

    public static void main(String[] args) {
        System.out.println("Run...");
        EigthImpl eigth = new EigthImpl();
        ConsoleScanner scanner = new ConsoleScanner();
        //
        int number  = scanner.readInt();
        System.out.println("Char - " + eigth.getChar(number));
    }
}
