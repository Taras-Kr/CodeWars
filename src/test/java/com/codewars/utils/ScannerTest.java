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

    @Test (dataProvider = "dpReadString")
    public void testReadString(String inputString, String expected) {
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStream);
        ConsoleScanner consoleScanner = new ConsoleScanner();
        String actual = consoleScanner.readString();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpReadValidLong")
    public void testReadValidLong(String inputLong, long expectedLong){
        InputStream inputStream  = new ByteArrayInputStream(inputLong.getBytes());
        System.setIn(inputStream);
        ConsoleScanner consoleScanner = new ConsoleScanner();
        long actualLong = consoleScanner.readLong();
        Assert.assertEquals(actualLong, expectedLong);
    }

    @Test(dataProvider = "dpReadInvalidLong")
    public void testReadInvalidLong(String inputLong, String expectedMessage) {
        InputStream inputStream = new ByteArrayInputStream(inputLong.getBytes());
        System.setIn(inputStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        consoleScanner.readLong();
        String actualMessage = outputStream.toString().replaceAll("\r\n","");
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(dataProvider = "dpReadValidBoolean")
    public void testReadValidBoolean(String inputBoolean, boolean expected) {
        InputStream inputStream = new ByteArrayInputStream(inputBoolean.getBytes());
        System.setIn(inputStream);
        ConsoleScanner consoleScanner = new ConsoleScanner();
        boolean actual = consoleScanner.readBoolean();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpReadInvalidBoolean")
    public void testReadInvalidBoolean(String inputBoolean, String expectedMessage) {
        InputStream inputStream = new ByteArrayInputStream(inputBoolean.getBytes());
        System.setIn(inputStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ConsoleScanner consoleScanner = new ConsoleScanner();
        consoleScanner.readBoolean();
        String actualMessage = outputStream.toString();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}


