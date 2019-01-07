package cn.kimtian.tree;

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
}
