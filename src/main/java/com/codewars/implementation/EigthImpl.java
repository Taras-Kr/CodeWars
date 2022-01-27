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

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int opposite(int number) {
        return -1 * number;
    }

    @Override
    public boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0 ? true : false;
    }

    @Override
    public int rentalCarCost(int d) {
        int rentalCost = 40 * d;
        if (d >= 0 && d < 3) {
            return rentalCost;
        }
        if (d >= 3 && d < 7) {
            return rentalCost - 20;
        }
        if(d >= 7){
            return rentalCost - 50;
        }
      return 0;
    }

    @Override
    public String repeatStr(int repeat, String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }
}
