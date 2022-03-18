package com.codewars.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ScannerTest extends ScannerDataProvider{

    @Test(dataProvider = "dpReadValidInt")
    public void testReadValidInt(String number, int expected) {
        InputStream inputStream = new ByteArrayInputStream(number.getBytes());
        System.setIn(inputStream);
        ConsoleScanner consoleScanner = new ConsoleScanner();
        int actual = consoleScanner.readInt();
        Assert.assertEquals(actual, expected);
    }

    @Test (dataProvider = "dpReadInvalidInt")
    public void testReadInvalidInt(String inputString, String expected){
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream (outputStream));
        ConsoleScanner scanner = new ConsoleScanner();
        scanner.readInt();
        String actual = outputStream.toString();
        Assert.assertEquals(actual, expected);
    }
}
