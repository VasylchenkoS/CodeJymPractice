package com.gojavaonline2.vasylchenko.practice.task_5;

import junit.framework.Assert;
import org.junit.Test;

public class BSTSearchTest {

    @Test
    public void testExist() throws Exception {
        TreeNode input = new TreeNode(0,new TreeNode(1,null,null),new TreeNode(2,null,null));
        int target = 0;
        boolean expected = true;
        Assert.assertEquals(expected, new BSTSearch().exist(input, target));
    }
    @Test
    public void testExist2() throws Exception {
        TreeNode input = new TreeNode(0,new TreeNode(0,null,null),new TreeNode(0,null,null));
        int target = 5;
        boolean expected = false;
        Assert.assertEquals(expected, new BSTSearch().exist(input, target));
    }
    @Test
    public void testExist3() throws Exception {
        TreeNode input = new TreeNode(5, null, null);
        int target = 0;
        boolean expected = false;
        Assert.assertEquals(expected, new BSTSearch().exist(input, target));
    }
}