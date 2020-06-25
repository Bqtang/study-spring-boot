package com.example.demo.arithmetic.practice;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: tbq
 * @DateTime: 2020/6/21 8:18 PM
 * @Description: 检查平衡性
 * 题目：
 * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回 true 。
 * <p>
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 * 1
 * / \
 * 2   2
 * / \
 * 3   3
 * / \
 * 4   4
 * 返回 false 。
 * <p>
 * 最优解(递归求解最大深度)
 */
public class Practice_04_04_balance {

    public class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (Math.abs(getDept(root.left, 0) - getDept(root.right, 0)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDept(TreeNode node, int dept) {
        if (node == null) {
            return dept;
        }
        int leftDept = getDept(node.left, dept + 1);
        int rightDept = getDept(node.right, dept + 1);
        return Math.max(leftDept, rightDept);
    }

}
