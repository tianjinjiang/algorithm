package cn.kimtian.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 链式存储的二叉树
 *
 * @author kimtian
 */
public class BinaryTree {
    /**
     * 根结点
     */
    TreeNode root;

    public void middleThreadNodes() {
        middleThreadNodes(root);
    }

    /**
     * 中序线索化二叉树
     */
    public void middleThreadNodes(TreeNode node) {
        //当前结点如果为空，则直接返回
        if (node == null) {
            return;
        }
        //处理左子树
        middleThreadNodes(node.leftNode);
        //如果左子树为空，处理前驱结点
        if(node.leftNode==null){
            //让当前结点的左子针指向前驱结点，并改变当前结点的左指针的类型
            node.leftNode = null;
            node.leftType =1;
        }
        //处理右子树
        middleThreadNodes(node.rightNode);
    }

    /**
     * 设置根结点
     *
     * @param root 根结点
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 获取根结点
     *
     * @return TreeNode 根结点
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * 层级遍历
     */
    public void levelShow(TreeNode treeNode) {
        //如果根结点为空，直接返回
        if (treeNode == null) {
            return;
        } else {
            //新建一个队列，存放树的结点
            Queue<TreeNode> q = new ArrayDeque<TreeNode>();
            //将根结点加入队列中
            q.add(treeNode);
            TreeNode cur;
            //如果队列不为空，循环输出
            while (!q.isEmpty()) {
                // 获取当前队列的队头
                cur = q.peek();
                //输出队头的值
                System.out.print(cur.value + " ");
                //将队头结点的左结点入队
                if (cur.leftNode != null) {
                    q.add(cur.leftNode);
                }
                //将队头结点的右结点入队
                if (cur.rightNode != null) {
                    q.add(cur.rightNode);
                }
                //将队头出队列
                q.poll();
            }
        }
    }

    /**
     * 先序遍历
     */
    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void middleShow() {
        if (root != null) {
            root.middleShow();
        }
    }

    /**
     * 后序遍历
     */
    public void behindShow() {
        if (root != null) {
            root.behindShow();
        }
    }

    /**
     * 查找二叉树的结点--先序查找
     *
     * @param i 查找的结点的值
     */
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    /**
     * 查找二叉树的结点--中序查找
     *
     * @param i 查找的结点的值
     */
    public TreeNode middleSearch(int i) {
        return root.middleSearch(i);
    }

    /**
     * 查找二叉树的结点--后序查找
     *
     * @param i 查找的结点的值
     */
    public TreeNode behindSearch(int i) {
        return root.behindSearch(i);
    }

    /**
     * 删除二叉树的结点/子树
     *
     * @param i 查找的结点的值
     */
    public void deleteTreeNode(int i) {
        if (root.value == i) {
            root = null;
        } else {
            root.deleteTreeNode(i);
        }
    }

    /**
     * 判断空树
     */
    public boolean isNullTree() {
        return this.root == null;
    }

    /**
     * 计算二叉树深度
     */
    public int treeDepth() {
        if (this.root == null) {
            //若为空树深度为0
            return 0;
        } else {
            return root.findDepth();
        }
    }
}
