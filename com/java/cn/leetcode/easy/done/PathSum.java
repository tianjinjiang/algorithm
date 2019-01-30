package cn.leetcode.easy.done;

import cn.kimtian.tree.TreeNode;

/**
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * @author kimtian
 * @date 2019.01.13
 * @num 112
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        //如果根结点就为空，直接返回false
        if (root == null) {
            return false;
        }
        //每次更改总数值，为其减去当前结点的值
        sum -= root.value;
        //如果左右结点都为空，没有可以递归的值，则终止递归，判断最终结果是否为0
        if ((root.leftNode == null) && (root.rightNode == null)) {
            return (sum == 0);
        }
        //左右结点不为空，则递归左右结点，继续求sum值
        return hasPathSum(root.leftNode, sum) || hasPathSum(root.rightNode, sum);
    }
}
