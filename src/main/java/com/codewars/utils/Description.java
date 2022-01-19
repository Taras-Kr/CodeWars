package com.codewars.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Description {

    GET_CHAR("getChar", "Write a function get_char() / getChar()\n" + "which takes a number and returns the corresponding ASCII char for that value.", "8");

    @Getter
    private final String methodName;
    @Getter
    private final String detail;
    @Getter
    private final String difficulty;
}
