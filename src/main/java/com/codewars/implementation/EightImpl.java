package com.codewars.implementation;

import com.codewars.interfaces.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {

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

    @Override
    public String reverse(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }

    @Override
    public int century(int number) {
        return number % 100 == 0 ? number / 100 : number/100 + 1;
    }

    @Override
    public String convert(boolean b) {
        return b == true ? "true" : "false";
    }

    @Override
    public int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> 2 * x).toArray();

        //Alternative implementation
//        int[] resArr = arr;
//        for (int i = 0; i < arr.length; i++) {
//            resArr[i] = 2 * resArr[i];
//        }
//        return resArr;
    }

    @Override
    public String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);

        //Alternative implementation
//        String fullName = "";
//        for (String n : name) {
//            fullName += n + " ";
//        }
//        fullName = fullName.trim();
//        return String.format("Hello, %s! Welcome to %s, %s!", fullName, city, state);
    }
}
