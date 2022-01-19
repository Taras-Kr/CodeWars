package com.codewars.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Description {

    GET_CHAR("getChar", "Write a function get_char() / getChar()\n" +
            "which takes a number and returns the corresponding ASCII char for that value.\n", "8"),
    FAKE_BIN("fakeBin", "Given a string of digits, you should replace\n" +
            "any digit below 5 with '0' and any digit 5 and above with '1'.\n" + "Return the resulting string.\n" +
            "\n" + "Note: input will never be an empty string\n", "8");

    @Getter
    private final String methodName;
    @Getter
    private final String detail;
    @Getter
    private final String difficulty;
}
