package com.codewars.kata;

import com.codewars.implementation.SevenImpl;
import com.codewars.interfaces.Seven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider{

    Seven seven = new SevenImpl();

    @Test(dataProvider = "dpStringMerge")
    public void testStringMerge(String wordOne, String wordTwo, char letter, String expected){
        Assert.assertEquals(seven.stringMerge(wordOne, wordTwo,letter), expected);
    }

    @Test(dataProvider = "dpCost")
    public void testCost(int time, int expected){
        Assert.assertEquals(seven.cost(time), expected);
    }
}
