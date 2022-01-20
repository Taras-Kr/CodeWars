package com.codewars.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Description {

    GET_CHAR("getChar", "Write a function get_char() / getChar()\n" +
            "which takes a number and returns the corresponding ASCII char for that value.\n", "8"),
    FAKE_BIN("fakeBin", "Given a string of digits, you should replace\n" +
            "any digit below 5 with '0' and any digit 5 and above with '1'.\n" + "Return the resulting string.\n" +
            "\n" + "Note: input will never be an empty string\n", "8"),
    STRING_MERGE("stringMerge", "Given two words and a letter, return a single\n" +
            "word that's a combination of both words, merged at the point where the given letter\n" +
            "first appears in each word. The returned word should have the beginning of the first\n" +
            "word and the ending of the second, with the dividing letter in the middle.\n" +
            "You can assume both words will contain the dividing letter.", "7");


    @Getter
    private final String methodName;
    @Getter
    private final String detail;
    @Getter
    private final String difficulty;
}
