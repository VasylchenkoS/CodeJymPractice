package com.gojavaonline2.vasylchenko.practice.task_5;

/*Знайти число в бінарному дереві пошуку і
повернути true якщо воно присутнє, інакше повернути false.*/

public class BSTSearch {
    public boolean exist(TreeNode root, int target) {
        if (root == null)
            return false;
        if (root.getValue() == target)
            return true;
        if (root.getValue() > target)
            return exist(root.getLeft(), target);
        else
            return exist(root.getRight(), target);
    }
}

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}


