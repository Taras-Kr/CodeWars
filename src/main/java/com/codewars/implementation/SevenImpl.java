package com.codewars.implementation;

import com.codewars.interfaces.Seven;

public class SevenImpl implements Seven {

    @Override
    public String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0,s1.indexOf(letter))+s2.substring(s2.indexOf(letter));
    }

    @Override
    public int cost(int mins) {

        int hour = mins / 60;
        int minutes = mins % 60;

        if (hour == 0 && minutes >= 1) {
            return 30;
        }
        if (hour >= 1) {
            if (minutes <= 5) {
                return 30 + (hour - 1) * 20;
            }
            if (minutes > 5 && minutes <= 35) {
                return 30 + (hour - 1) * 20 + 10;
            }
            if (minutes > 35 && minutes <= 59) {
                return 30 + (hour - 1) * 20 + 10 + 10;
            }
        }
        return 0;
    }
}
