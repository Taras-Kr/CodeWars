package com.codewars.utils;

import org.testng.annotations.DataProvider;

public class ScannerDataProvider {

    @DataProvider(name = "dpReadValidInt")
    public Object[][] dpReadValidInt(){
        return new Object[][]{
                {"-2147483648", -2147483648},
                {"0", 0},
                {"2147483647", 2147483647}
        };
    }

    @DataProvider(name = "dpReadInvalidInt")
    public Object[][] dpReadInvalidInt() {
        return new Object[][]{
                {"some_text\n1", "Bad integer number! Try again: "},
                {"13658g2\n1","Bad integer number! Try again: " },
                {"-2147483649\n1", "Bad integer number! Try again: "},
                {"2147483648\n1", "Bad integer number! Try again: "}
        };
    }
}
