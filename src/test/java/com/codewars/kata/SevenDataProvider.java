package com.codewars.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider {

    @DataProvider(name = "dpStringMerge")
    public Object[][] dpStringMerge(){
        return new Object[][]{
                {"hello", "world", 'l', "held"},
                {"coding", "anywhere", 'n', "codinywhere"},
                {"jason", "samson", 's', "jasamson"},
                {"wonderful", "people", 'e', "wondeople"}
        };
    }

    @DataProvider(name = "dpCost")
    public Object[][] dpCost() {
        return new Object[][]{
                {0, 0},
                {1, 30},
                {45, 30},
                {63, 30},
                {84, 40},
                {102, 50},
                {273, 100}
        };
    }
}
