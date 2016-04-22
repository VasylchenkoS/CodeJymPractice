package com.gojavaonline2.vasylchenko.practice.Task_1;

import org.junit.*;
import org.junit.Test;

public class SumDigitsTest {

    @Test
    public void testSum() throws Exception {
            String result = "6";
            int input = 123;
            Assert.assertEquals(result, String.valueOf(new SumDigits().sum(input)));
    }

    @Test
    public void testSum1() throws Exception {
            String result = "47";
            int input = -2147483648;
            Assert.assertEquals(result, String.valueOf(new SumDigits().sum(input)));
    }
}