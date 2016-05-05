package com.gojavaonline2.vasylchenko.practice.task_3;

import org.junit.Assert;
import org.junit.Test;

public class ReversePolishNotationTest {

    @Test
    public void testEvaluate() throws Exception {
        String input = "1 2 +";
        int expected = 3;
        Assert.assertEquals(expected,new ReversePolishNotation().evaluate(input));

    }
    @Test
    public void testEvaluate1() throws Exception {
        String input = "17 2 -";
        int expected = 15;
        Assert.assertEquals(expected,new ReversePolishNotation().evaluate(input));
    }
    @Test
    public void testEvaluate2() throws Exception {
        String input = "3";
        int expected = 3;
        Assert.assertEquals(expected,new ReversePolishNotation().evaluate(input));
    }
    @Test
    public void testEvaluate3() throws Exception {
        String input = "1 3 2 * +";
        int expected = 7;
        Assert.assertEquals(expected,new ReversePolishNotation().evaluate(input));
    }
    @Test
    public void testEvaluate4() throws Exception {
        String input = "";
        int expected = 0;
        Assert.assertEquals(expected,new ReversePolishNotation().evaluate(input));
    }
    @Test
    public void testEvaluate5() throws Exception {
        String input = " ";
        int expected = 0;
        Assert.assertEquals(expected,new ReversePolishNotation().evaluate(input));
    }
}