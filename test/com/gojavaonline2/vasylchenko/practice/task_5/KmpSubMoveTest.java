package com.gojavaonline2.vasylchenko.practice.task_5;

import junit.framework.Assert;
import org.junit.Test;

public class KmpSubMoveTest {

    @Test
    public void testSubMoveQuantity() throws Exception {
        String input = "abcd";
        String inputWithP = "cdab";
        int expected = 2;
        Assert.assertEquals(expected, new KmpSubMove().subMoveQuantity(input, inputWithP));
    }
    @Test
    public void testSubMoveQuantity1() throws Exception {
        String input = "abracadabra";
        String inputWithP = "raabracadab";
        int expected = 9;
        Assert.assertEquals(expected, new KmpSubMove().subMoveQuantity(inputWithP, input));
    }
}