package com.codewars.kata;

import com.codewars.implementation.EightImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.codewars.interfaces.Eight;

public class EightTest extends EightDataProvider {

    Eight eight = new EightImpl();

    @Test(dataProvider = "dpGetChar")
    public void testGetChar(int value, char expected) {
        char actual = eight.getChar(value);
        Assert.assertEquals(actual, expected);
    }

}
