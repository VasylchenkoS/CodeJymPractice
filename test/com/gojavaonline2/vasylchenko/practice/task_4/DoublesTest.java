package com.gojavaonline2.vasylchenko.practice.task_4;

import junit.framework.Assert;
import org.junit.Test;

public class DoublesTest {

    @Test
    public void testParse() throws Exception {
        String input = "1";
        double expected = 1.0;
        Assert.assertEquals(expected,new Doubles().parse(input));
    }
    @Test
    public void testParse1() throws Exception {
        String input = "-.";
        Double expected = null;
        Assert.assertEquals(expected,new Doubles().parse(input));
    }
}