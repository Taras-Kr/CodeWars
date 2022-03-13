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

}
