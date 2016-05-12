package com.gojavaonline2.vasylchenko.practice.task_3;

import org.junit.Assert;
import org.junit.Test;

public class UnixPathTest {

    @Test
    public void testSimplify() throws Exception {
        String input = "/home/../var/./lib//file.txt";
        String expected = "/var/lib/file.txt";
        Assert.assertEquals(expected,new UnixPath().simplify(input));
    }
    @Test
    public void testSimplify1() throws Exception {
        String input = "/var//lib/";
        String expected = "/var/lib";
        Assert.assertEquals(expected,new UnixPath().simplify(input));
    }
    @Test
    public void testSimplify2() throws Exception {
        String input = "//";
        String expected = "/";
        Assert.assertEquals(expected,new UnixPath().simplify(input));
    }
    @Test
    public void testSimplify3() throws Exception {
        String input = "/.";
        String expected = "/";
        Assert.assertEquals(expected,new UnixPath().simplify(input));
    }
    @Test
    public void testSimplify4() throws Exception {
        String input = "/var/lib/../log/./../tmp/data///.";
        String expected = "/var/tmp/data";
        Assert.assertEquals(expected,new UnixPath().simplify(input));
    }
}