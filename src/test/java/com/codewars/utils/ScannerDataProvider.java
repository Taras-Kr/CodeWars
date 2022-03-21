package com.codewars.utils;

import org.testng.annotations.DataProvider;

public class ScannerDataProvider {

    @DataProvider(name = "dpReadValidInt")
    public Object[][] dpReadValidInt() {
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
                {"13658g2\n1", "Bad integer number! Try again: "},
                {"-2147483649\n1", "Bad integer number! Try again: "},
                {"2147483648\n1", "Bad integer number! Try again: "}
        };
    }

    @DataProvider(name = "dpReadString")
    public Object[][] dpReadString() {
        return new Object[][]{
                {"expectedString", "expectedString"}
        };
    }

    @DataProvider(name = "dpReadValidLong")
    public Object[][] dpReadValidLong() {
        return new Object[][]{
                {"-9223372036854775808", -9223372036854775808L},
                {"0", 0L},
                {"9223372036854775807", 9223372036854775807L}
        };
    }

    @DataProvider(name = "dpReadInvalidLong")
    public Object[][] dpReadInvalidLong(){
        return new Object[][]{
                {"-9223372036854775809\n1", "Bad Long value! Try again."},
                {"9223372036854775808\n1", "Bad Long value! Try again."}
        };
    }

    @DataProvider (name = "dpReadValidBoolean")
    public Object[][] dpReadValidBoolean(){
        return new Object[][]{
                {"true", true},
                {"True",true},
                {"TRUE",true},
                {"false",false},
                {"False",false},
                {"FALSE",false}
        };
    }

    @DataProvider(name = "dpReadInvalidBoolean")
    public Object[][] dpReadInvalidBoolean() {
        return new Object[][]{
                //{" \n", "Bad boolean. Try again:"}
                {"Tru\nTrue", "Bad boolean. Try again:"},
                {"Falsa\nTrue", "Bad boolean. Try again:"},
                {"1\nTrue", "Bad boolean. Try again:"},
                {"0\nFalse", "Bad boolean. Try again:"}

        };
    }

    @DataProvider(name = "dpReadValidIntArray")
    public Object[][] dpReadValidIntArray() {
        return new Object[][]{
                {"5\n0\n1\n2\n3\n4", new int[]{0, 1, 2, 3, 4}},
                {"1\n1", new int[]{1}}
        };
    }

    @DataProvider(name = "dpReadValidStringArray")
    public Object[][] dpReadValidStringArray() {
        return new Object[][]{
                {"1\nstring", new String[]{"string"}},
                {"2\nstring\narray", new String[]{"string", "array"}}
        };
    }
}
