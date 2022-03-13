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
}
