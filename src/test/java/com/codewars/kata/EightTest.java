package com.codewars.kata;

import com.codewars.implementation.EightImpl;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codewars.interfaces.Eight;

public class EightTest {
    Eight eight = new EightImpl();

    @Test
    public void testGetChar() {
        char actual = eight.getChar(97);
        char expected = 'a';
        Assert.assertEquals(actual, expected);
    }

}
