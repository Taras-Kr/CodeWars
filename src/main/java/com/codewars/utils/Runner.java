package com.codewars.utils;

import com.codewars.implementation.EigthImpl;
import com.codewars.interfaces.Eight;

import static com.codewars.utils.Description.*;

public class Runner {
    private final ConsoleScanner scanner = new ConsoleScanner();
    private Eight eight;

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


}
