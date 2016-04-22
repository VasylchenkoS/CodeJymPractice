package com.gojavaonline2.vasylchenko.practice;

import org.junit.*;
import org.junit.Test;

public class AlphabetTest {

    @Test
    public void testCheck() throws Exception {
        String input = "qwertyuiopasdfghjklzxcvbnm";
        boolean isTrue = true;
        Assert.assertEquals(isTrue, new Alphabet().check(input));
    }

    @Test
    public void testCheck1() throws Exception {
        String input = "\"abcdeFghijKlmnopqrstuvwxyz\"";
        boolean isTrue = true;
        Assert.assertEquals(isTrue, new Alphabet().check(input));
    }
}