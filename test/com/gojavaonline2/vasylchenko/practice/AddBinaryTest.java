package com.gojavaonline2.vasylchenko.practice;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void testAdd() throws Exception {
        String input1 = "101";
        String input2 = "100";
        String expected = "1001";
        Assert.assertEquals(expected, new AddBinary().add(input1, input2));
    }
}