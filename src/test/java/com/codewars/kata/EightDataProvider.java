package com.codewars.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider {

    @DataProvider(name = "dpGetChar")
    public Object[][] dpGetChar() {
        return new Object[][]{{97, 'a'}, {49, '1'}, {43, '+'}};
    }

    @DataProvider(name = "dpFakeBin")
    public Object[][] dpFakeBin() {
        return new Object[][]{{"0", "0"}, {"4", "0"}, {"5", "1"}, {"9", "1"}, {"0123456789", "0000011111"}, {"9876543210", "1111100000"},};
    }

    @DataProvider(name = "dpDoubleInteger")
    public Object[][] dpDoubleInteger() {
        return new Object[][]{{0, 0}, {1, 2}, {125, 250}, {-10, -20}};
    }

    @DataProvider(name = "dpMultiply")
    public Object[][] dpMultiply() {
        return new Object[][]{{0, 0, 0}, {0, 1, 0}, {1, 0, 0}, {2, 5, 10}, {-2, 5, -10}, {2, -5, -10}, {-2, -5, 10}};
    }

    @DataProvider(name = "dpOpposite")
    public Object[][] dpOpposite() {
        return new Object[][]{{0, 0}, {-100, 100}, {100, -100}};
    }

    @DataProvider(name = "dpIsDivisibleTrue")
    public Object[][] dpIsDivisibleTrue() {
        return new Object[][]{{6, 2, 3}, {-15, 5, -3},};
    }

    @DataProvider(name = "dpIsDivisibleFalse")
    public Object[][] dpIsDivisibleFalse() {
        return new Object[][]{{2, 6, 2}, {20, -3, 4}};
    }

    @DataProvider(name ="dpRentalCarCost")
    public Object[][] dpRentalCarCost() {
        return new Object[][]{
                {0, 0},
                {1, 40},
                {2, 80},
                {3, 100},
                {6, 220},
                {7, 230},
                {10, 350}
        };
    }
}
