package com.gojavaonline2.vasylchenko.practice.task_3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GnomeFoodTest {

    @Test
    public void testFind() throws Exception {
        int gnomeInput[] = {5, 7, 6, 9, 4};
        int foodInput[] = {8, 5, 6, 2, 3};
        String expected = "[4, 2, 1, 0, 3]";
        Assert.assertEquals(expected, Arrays.toString(new GnomeFood().find(gnomeInput, foodInput)));
    }
    @Test
    public void testFind1() throws Exception {
        int gnomeInput[] = {5};
        int foodInput[] = {8};
        String expected = "[0]";
        Assert.assertEquals(expected, Arrays.toString(new GnomeFood().find(gnomeInput, foodInput)));
    }
    @Test
    public void testFind2() throws Exception {
        int gnomeInput[] = {};
        int foodInput[] = {};
        String expected = "[]";
        Assert.assertEquals(expected, Arrays.toString(new GnomeFood().find(gnomeInput, foodInput)));
    }
}