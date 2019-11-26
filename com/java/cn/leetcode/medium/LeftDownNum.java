package cn.leetcode.medium;

import cn.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，在树的最后一行找到最左边的值。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * <p>
 *   2
 *  / \
 * 1   3
 * <p>
 * 输出:
 * 1
 *  
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * <p>
 *        1
 *      /  \
 *     2   3
 *    /   / \
 *   4   5   6
 *  /
 * 7
 * <p>
 * 输出:
 * 7
 *  
 * <p>
 * 注意: 您可以假设树（即给定的根节点）不为 NULL
 *
 * @author kimtian
 * @date 2019.11.25
 */
public class LeftDownNum {
    /**
     * 找树左下角的值
     *
     * @param root 树
     * @return 树左下角的值
     * @num 513
     */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        if(root.getRight()!=null){

        }
        return 0;
    }
}
