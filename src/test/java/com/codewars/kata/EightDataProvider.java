package com.codewars.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider {

    @DataProvider(name = "dpGetChar")
    public Object[][] dpGetChar() {
        return new Object[][]{
                {97, 'a'},
                {49, '1'},
                {43, '+'}
        };
    }

    @DataProvider(name = "dpFakeBin")
    public Object[][] dpFakeBin() {
        return new Object[][]{
                {"0", "0"},
                {"4", "0"},
                {"5", "1"},
                {"9", "1"},
                {"0123456789", "0000011111"},
                {"9876543210", "1111100000"},
        };
    }
}
