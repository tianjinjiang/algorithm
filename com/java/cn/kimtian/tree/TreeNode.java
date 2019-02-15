package cn.kimtian.tree;

/**
 * 树里面的结点
 *
 * @author kimtian
 */
public class TreeNode {
    /**
     * 树里面的值，结点的权
     */
   public int value;
    /**
     * 左儿子
     */
    public TreeNode leftNode;
    /**
     * 右儿子
     */
    public TreeNode rightNode;

    /**
     * 标识左指针类型
     */


    int leftType;
    /**
     * 标识右指针类型
     */
    int rightType;

    public TreeNode(int value) {
        this.value = value;
    }
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    /**
     * 先序遍历--递归思想
     */
    public void frontShow() {
        //先遍历当前结点的内容
        System.out.print(value + " ");
        //左结点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右结点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void middleShow() {
        //左结点
        if (leftNode != null) {
            leftNode.middleShow();
        }
        System.out.print(value + " ");
        //右结点
        if (rightNode != null) {
            rightNode.middleShow();
        }
    }

    /**
     * 后序遍历
     */
    public void behindShow() {
        //左结点
        if (leftNode != null) {
            leftNode.behindShow();
        }
        //右结点
        if (rightNode != null) {
            rightNode.behindShow();
        }
        System.out.print(value + " ");
    }

    /**
     * 先序查找
     *
     * @param i 查找的结点的值
     */
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //对比当前结点的值
        if (value == i) {
            return this;
        }
        //当前结点的值不是要查找的结点
        else {
            //查找左儿子
            if (leftNode != null) {
                target = leftNode.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
            //查找右儿子
            if (rightNode != null) {
                target = rightNode.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
        }
        return target;
    }

    /**
     * 中序查找
     *
     * @param i 查找的结点的值
     */
    public TreeNode middleSearch(int i) {
        TreeNode target = null;
        //对比左儿子的值
        if (leftNode != null) {
            target = leftNode.middleSearch(i);
        }
        if (target != null) {
            return target;
        }
        //对比当前结点的值
        if (value == i) {
            return this;
        }
        //查找右儿子
        if (rightNode != null) {
            target = rightNode.middleSearch(i);
        }
        if (target != null) {
            return target;
        }

        return target;
    }

    /**
     * 后序查找
     *
     * @param i 查找的结点的值
     */
    public TreeNode behindSearch(int i) {
        TreeNode target = null;
        //对比左儿子的值
        if (leftNode != null) {
            target = leftNode.behindSearch(i);
        }
        if (target != null) {
            return target;
        }
        //查找右儿子
        if (rightNode != null) {
            target = rightNode.behindSearch(i);
        }
        if (target != null) {
            return target;
        }

        //对比当前结点的值
        if (value == i) {
            return this;
        }
        return target;
    }

    /**
     * 删除二叉树的结点/子树
     *
     * @param i 要删除的结点的值
     */
    public void deleteTreeNode(int i) {
        TreeNode parent = this;
        //判断左儿子
        if (parent.leftNode != null && parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        //判断右边儿子
        if (parent.rightNode != null && parent.rightNode.value == i) {
            parent.rightNode = null;
            return;
        }
        //递归检查并删除左儿子
        parent = leftNode;
        if (parent != null) {
            parent.deleteTreeNode(i);
        }
        //递归检查并删除右儿子
        parent = rightNode;
        if (parent != null) {
            parent.deleteTreeNode(i);
        }

    }

    /**
     * 查找数的深度
     */
    public int findDepth() {
        int maxDepth = 1;
        //由于是完全二叉树，所以树的深度就是一直查找左结点的深度
        while (leftNode != null) {
            maxDepth++;
            leftNode = leftNode.leftNode;
        }
        return maxDepth;
    }
}
