package com.codewars.utils;

public enum Description {
    GET_CHAR("getChar", "Write a function get_char() / getChar()\n" + "which takes a number and returns the corresponding ASCII char for that value.", "8");

    String methodName;
    String detail;
    String difficulty;

    Description(String methodName, String detail, String difficulty) {
        this.methodName = methodName;
        this.detail = detail;
        this.difficulty = difficulty;
    }

}
