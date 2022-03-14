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
}
