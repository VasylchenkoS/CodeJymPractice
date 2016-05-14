package com.gojavaonline2.vasylchenko.practice.task_4;

import org.junit.Assert;
import org.junit.Test;

public class WordNumberTest {

    @Test
    public void testCount() throws Exception {
        String input = "red/green/blue";
        int expected = 3;
        Assert.assertEquals(expected, new WordNumber().count(input));
    }
    @Test
    public void testCount1() throws Exception {
        String input = "Some 1text with numbers1";
        int expected = 4;
        Assert.assertEquals(expected, new WordNumber().count(input));
    }
}