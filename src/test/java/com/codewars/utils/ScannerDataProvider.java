package com.codewars.utils;

import org.testng.annotations.DataProvider;

public class ScannerDataProvider {

    @DataProvider(name = "dpReadValidIntValid")
    public Object[][] dpReadValidInt(){
        return new Object[][]{
                {"100", 100},
                {"-100", -100}
        };
    }
}
