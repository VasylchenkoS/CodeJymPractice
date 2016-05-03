package com.gojavaonline2.vasylchenko.practice.task_2;

import org.junit.Assert;
import org.junit.Test;

public class AbcNumberTest {

    @Test
    public void testConvert() throws Exception {
        String input = "bcd";
        int result = 123;
        Assert.assertEquals(result, new AbcNumber().convert(input));
    }
    @Test
    public void testConvert1() throws Exception {
        String input = "z";
        int result = 25;
        Assert.assertEquals(result, new AbcNumber().convert(input));
    }
    @Test
    public void testConvert2() throws Exception {
        String input = "";
        int result = -1;
        Assert.assertEquals(result, new AbcNumber().convert(input));
    }
}