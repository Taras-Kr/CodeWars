package com.codewars.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Description {

    GET_CHAR("getChar", "Write a function get_char() / getChar()\n" +
            "which takes a number and returns the corresponding ASCII char for that value.\n", "8", ""),
    FAKE_BIN("fakeBin", "Given a string of digits, you should replace\n" +
            "any digit below 5 with '0' and any digit 5 and above with '1'.\n" + "Return the resulting string.\n" +
            "\n" + "Note: input will never be an empty string\n", "8", ""),
    DOUBLE_INTEGER("doubleInteger", "Code as fast as you can! You need to double the integer and return it.",
            "8", "https://www.codewars.com/kata/you-cant-code-under-pressure-number-1/"),
    MULTYPLY("multiply", "Implement a function which multiplies two numbers.",
            "8", "https://www.codewars.com/kata/function-3-multiplying-two-numbers/"),
    STRING_MERGE("stringMerge", "Given two words and a letter, return a single\n" +
            "word that's a combination of both words, merged at the point where the given letter\n" +
            "first appears in each word. The returned word should have the beginning of the first\n" +
            "word and the ending of the second, with the dividing letter in the middle.\n" +
            "You can assume both words will contain the dividing letter.", "7", ""),
    COST("cost","Fast & Furious Driving School's (F&F) charges for lessons are as below:\n" +
            "\n" +
            "Time\tCost\n" +
            "Up to 1st hour\t$30\n" +
            "Every subsequent half hour**\t$10\n" +
            "** Subsequent charges are calculated by rounding up to nearest half hour.\n" +
            "For example, if student X has a lesson for 1hr 20 minutes, he will be charged $40 (30+10) for 1 hr 30 mins\n" +
            "and if he has a lesson for 5 minutes, he will be charged $30 for the full hour.\n" +
            "\n" +
            "Out of the kindness of its heart, F&F also provides a 5 minutes grace period. So, if student X were to have\n" +
            "a lesson for 65 minutes or 1 hr 35 mins, he will only have to pay for an hour or 1hr 30 minutes respectively.\n" +
            "\n" +
            "For a given lesson time in minutes (min) , write a function cost to calculate how much the lesson costs.\n" +
            "Input is always > 0.","7","https://www.codewars.com/kata/589b1c15081bcbfe6700017a/train/java");


    @Getter
    private final String methodName;
    @Getter
    private final String detail;
    @Getter
    private final String difficulty;
    @Getter
    private final String url;
}
