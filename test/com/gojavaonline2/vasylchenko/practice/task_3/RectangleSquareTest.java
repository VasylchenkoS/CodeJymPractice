package com.gojavaonline2.vasylchenko.practice.task_3;

import org.junit.Assert;
import org.junit.Test;

public class RectangleSquareTest {

    @Test
    public void testMeasure() throws Exception {
        int inputX[] = {0, 0};
        int inputH[] = {20, 10};
        int inputW[] = {10, 20};
        int expected = 300;
        Assert.assertEquals(expected, new RectangleSquare().measure(inputX, inputH, inputW));
    }

    @Test
    public void testMeasure1() throws Exception {
        int inputX[] = {0, 10};
        int inputH[] = {10, 10};
        int inputW[] = {10, 10};
        int expected = 200;
        Assert.assertEquals(expected, new RectangleSquare().measure(inputX, inputH, inputW));
    }
}