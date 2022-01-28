package com.codewars.utils;

import com.codewars.implementation.EigthImpl;
import com.codewars.implementation.SevenImpl;
import com.codewars.interfaces.Eight;
import com.codewars.interfaces.Seven;

import static com.codewars.utils.Description.*;

public class Runner {
    private final ConsoleScanner scanner = new ConsoleScanner();
    private Eight eight;
    private Seven seven;

    public void difficulty_8_getChar() {
        System.out.println("\n\t#Description:\n"+ GET_CHAR.getDetail());
        System.out.print("Input number: ");
        int number = scanner.readInt();
        eight = new EigthImpl();
        System.out.println("Char - " + eight.getChar(number));
    }

    public void difficulty_8_fakeBin() {
        System.out.println("\n\t#Description:\n" + FAKE_BIN.getDetail());
        System.out.print("Input numbers string: ");
        String numbersString = scanner.readString();
        eight = new EigthImpl();
        System.out.println("Fake_Bin - " + eight.fakeBin(numbersString));
    }

    public void difficult_8_doubleInteger(){
        System.out.println("\n\t#Description:\n" + DOUBLE_INTEGER.getDetail());
        System.out.print("Input integer: ");
        int number = scanner.readInt();
        eight = new EigthImpl();
        System.out.println("Double integer - " + eight.doubleInteger(number));
    }

    public void difficult_8_multiply() {
        System.out.println("\n\t#Description:\n" + MULTYPLY.getDetail());
        System.out.print("Input first integer number: ");
        int number1 = scanner.readInt();
        System.out.print("Input second integer number: ");
        int number2 = scanner.readInt();
        eight = new EigthImpl();
        System.out.println("Multiply numbers - " + eight.multiply(number1, number2));
    }

    public void difficult_8_opposite() {
        System.out.println("\n\t#Description:\n" + OPPOSITE.getDetail());
        System.out.print("Input integer number: ");
        int number = scanner.readInt();
        eight = new EigthImpl();
        System.out.println("Opposite to " + number + " - " + eight.opposite(number));
    }

    public void difficult_8_isDivisible() {
        System.out.println("\n\t#Description:\n" + IS_DIVISIBLE.getDetail());
        System.out.print("Input number for check: ");
        long number = scanner.readLong();
        System.out.print("Input first number: ");
        long firstNumber = scanner.readLong();
        System.out.print("Input second number: ");
        long secondNumber = scanner.readLong();
        eight = new EigthImpl();
        if (eight.isDivisible(number, firstNumber, secondNumber)) {
            System.out.println(number + " IS divisible by " + firstNumber + " and " + secondNumber);
        } else {
            System.out.println(number + " IS NOT divisible by " + firstNumber + " and " + secondNumber);
        }
    }

    public void difficult_8_rentalCarCost() {
        System.out.println("\n\t#Description:\n" + RENTAL_CAR_COST.getDetail());
        System.out.print("Input amount days: ");
        int day = scanner.readInt();
        eight = new EigthImpl();
        System.out.println("Total rental car cost - " + eight.rentalCarCost(day));
    }

    public void difficult_8_repeatStr() {
        System.out.println("\n\t#Description:\n" + REPEAT_STR.getDetail() + "\nURl: " + REPEAT_STR.getUrl());
        System.out.print("Input integer number: ");
        int repeat = scanner.readInt();
        System.out.print("Input string: ");
        String string = scanner.readString();
        eight = new EigthImpl();
        System.out.println("Result: " + eight.repeatStr(repeat, string));
    }

    public void difficult_8_reverse(){
        System.out.println("\n\t#Description:\n" + REVERSED_STRING.getDetail() + "\nURl: " + REVERSED_STRING.getUrl());
        System.out.print("Input string: ");
        String string = scanner.readStringLine();
        eight = new EigthImpl();
        System.out.println("Reversed string: " + eight.reverse(string));
    }

    public void difficult_8_century(){
        System.out.println("\n\t#Description:\n" + CENTURY.getDetail() + "\nURl: " + CENTURY.getUrl());
        System.out.print("Input year: ");
        int year = scanner.readInt();
        eight = new EigthImpl();
        System.out.println("Century: " + eight.century(year));
    }

    public void difficult_8_convert(){
        System.out.println("\n\t#Description:\n" + BOOLEAN_TO_STRING.getDetail() + "\nURl: " + BOOLEAN_TO_STRING.getUrl());
        System.out.print("Input boolean(true/false): ");
        boolean b = scanner.readBoolean();
        eight = new EigthImpl();
        System.out.println("String representation of Boolean: " + eight.convert(b));

    }

    public void difficult_7_stringMerge(){
        System.out.println("\n\t#Description:\n" + STRING_MERGE.getDetail());
        System.out.print("Input first word: ");
        String firstWord = scanner.readString();
        System.out.print("Input second word: ");
        String secondWord = scanner.readString();
        System.out.print("Input letter: ");
        char letter = scanner.readString().charAt(0);
        seven = new SevenImpl();
        System.out.println("Merged string - "+ seven.stringMerge(firstWord, secondWord, letter));
    }

    public void difficult_7_cost(){
        System.out.println("\n\t#Description:\n" + COST.getDetail());
        System.out.print("Input lesson duration in minutes: ");
        int lessonDuration = scanner.readInt();
        seven = new SevenImpl();
        System.out.println("Lesson cost - " + seven.cost(lessonDuration) + "$");
    }


}
