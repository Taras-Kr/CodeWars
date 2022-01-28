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
            "Input is always > 0.","7","https://www.codewars.com/kata/589b1c15081bcbfe6700017a/train/java"),
    OPPOSITE("int opposite(int number)", "Very simple, given an integer or a floating-point number, find its opposite.",
            "8" ,"https://www.codewars.com/kata/opposite-number/"),
    IS_DIVISIBLE("boolean isDivisible(long n, long x, long y)", "Create a function that checks\n" +
            "if a number n is divisible by two numbers x AND y.\n" +
            "All inputs are positive, non-zero digits.","8", "https://www.codewars.com/kata/is-n-divisible-by-x-and-y"),
    RENTAL_CAR_COST("int rentalCarCost(int d)", "After a hard quarter in the office you decide to get some rest on a vacation.\n" +
            "So you will book a flight for you and your girlfriend and try to leave all the mess behind you.\n" +
            "\n" +
            "You will need a rental car in order for you to get around in your vacation. The manager of the car\n" +
            "rental makes you some good offers.\n" +
            "\n" +
            "Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.\n" +
            "Alternatively, if you rent the car for 3 or more days, you get $20 off your total.\n" +
            "\n" +
            "Write a code that gives out the total amount for different days(d).", "8","https://www.codewars.com/kata/transportation-on-vacation/"),
    REPEAT_STR("String repeatStr(final int repeat, final String string)", "Write a function called repeatStr\n" +
            "which repeats the given string string exactly n times.", "8", "https://www.codewars.com/kata/string-repeat"),
    REVERSED_STRING("string reverseString(String str)", "Complete the solution so that it reverses the string passed into it.",
            "8", "https://www.codewars.com/kata/reversed-strings"),
    CENTURY("int century(int number)", "Introduction\n" +
            "The first century spans from the year 1 up to and including the year 100,\n" +
            "the second century - from the year 101 up to and including the year 200, etc.\n" +
            "\n" +
            "Task\n" +
            "Given a year, return the century it is in.\n" +
            "\n" +
            "Examples\n" +
            "1705 --> 18\n" +
            "1900 --> 19\n" +
            "1601 --> 17\n" +
            "2000 --> 20", "8", "https://www.codewars.com/kata/century-from-year");


    @Getter
    private final String methodName;
    @Getter
    private final String detail;
    @Getter
    private final String difficulty;
    @Getter
    private final String url;
}
