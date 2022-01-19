package com.codewars;

import com.codewars.implementation.EigthImpl;
import com.codewars.utils.ConsoleScanner;

import static com.codewars.utils.Description.*;

public class MainAppl {

    public static void main(String[] args) {
        System.out.println("Run...");
        EigthImpl eigth = new EigthImpl();
        ConsoleScanner scanner = new ConsoleScanner();
        //
//        System.out.println(Description.GET_CHAR.getDetail());
//        int number  = scanner.readInt();
//        System.out.println("Char - " + eigth.getChar(number));
        //
        System.out.println(FAKE_BIN.getDetail());
        String stringNumbers = scanner.readString();
        System.out.println("Fake_Bin - " + eigth.fakeBin(stringNumbers));
    }
}
