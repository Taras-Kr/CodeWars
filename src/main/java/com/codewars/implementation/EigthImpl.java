package com.codewars.implementation;

import com.codewars.interfaces.Eight;

public class EigthImpl implements Eight {

    @Override
    public char getChar(int c) {
        return (char)c;
    }

    @Override
    public String fakeBin(String numberString) {
        String result = numberString;
        result = result.replaceAll("[01234]", "0");
        result = result.replaceAll("[56789]", "1");
        return result;
    }

    @Override
    public int doubleInteger(int i) {
        return 2*i;
    }
}
