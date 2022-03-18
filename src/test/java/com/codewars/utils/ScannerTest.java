package com.codewars.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ScannerTest extends ScannerDataProvider{

    @Test(dataProvider = "dpReadValidIntValid")
    public void testReadValidInt(String number, int expected) {
        InputStream inputStream = new ByteArrayInputStream(number.getBytes());
        System.setIn(inputStream);
        ConsoleScanner consoleScanner = new ConsoleScanner();
        int actual = consoleScanner.readInt();
        Assert.assertEquals(actual, expected);
    }
}
