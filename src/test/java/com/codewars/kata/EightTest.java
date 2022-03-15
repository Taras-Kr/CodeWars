package com.codewars.kata;

import com.codewars.implementation.EightImpl;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codewars.interfaces.Eight;

public class EightTest extends EightDataProvider {

    private Eight eight = new EightImpl();

    @Test(dataProvider = "dpGetChar")
    public void testGetChar(int value, char expected) {
        char actual = eight.getChar(value);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpFakeBin")
    public void testFakeBin(String value, String expected){
        String actual = eight.fakeBin(value);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpDoubleInteger")
    public void testDoubleInteger(int number, int expected){
        int actual = eight.doubleInteger(number);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpMultiply")
    public void testMultiply(int numberOne, int numberTwo, int expected){
        int actual = eight.multiply(numberOne, numberTwo);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpOpposite")
    public void testOpposite(int number, int expected){
        int actual = eight.opposite(number);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dpIsDivisibleTrue")
    public void testIsDivisibleTrue(long number, long divOne, long divTwo) {
           Assert.assertTrue(eight.isDivisible(number, divOne, divTwo));
    }

    @Test(dataProvider = "dpIsDivisibleFalse")
    public void testIsDivisibleFalse(long number, long divOne, long divTwo) {
       Assert.assertFalse(eight.isDivisible(number, divOne, divTwo));
    }

    @Test(dataProvider = "dpRentalCarCost")
    public void testRentalCarCost(int day, int expected){
        Assert.assertEquals(eight.rentalCarCost(day), expected);
    }

    @Test(dataProvider = "dpRepeatStr")
    public void testRepeatStr(int repeat, String string, String expected) {
        Assert.assertEquals(eight.repeatStr(repeat, string), expected);
    }

    @Test(dataProvider = "dpReverse")
    public void testReverse(String string, String expected) {
        Assert.assertEquals(eight.reverse(string), expected);
    }

    @Test(dataProvider = "dpCentury")
    public void testCentury(int year, int expected) {
        Assert.assertEquals(eight.century(year), expected);
    }

    @Test(dataProvider = "dpConvert")
    public void testConvert(boolean value, String expected){
        Assert.assertEquals(eight.convert(value), expected);
    }

    @Test(dataProvider = "dpMap")
    public void testMap(int[] array, int[] expected) {
        Assert.assertEquals(eight.map(array), expected);
    }

    @Test(dataProvider = "dpSayHello")
    public void testSayHello(String[] name, String city, String state, String expected){
        Assert.assertEquals(eight.sayHello(name, city, state), expected);
    }
}
