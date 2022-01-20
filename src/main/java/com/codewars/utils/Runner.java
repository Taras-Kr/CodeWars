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
