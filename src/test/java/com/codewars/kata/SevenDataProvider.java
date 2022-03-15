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
}
