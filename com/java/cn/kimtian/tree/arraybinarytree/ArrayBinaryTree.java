package cn.kimtian.tree.arraybinarytree;

import cn.kimtian.Constants;

/**
 * 顺序存储的二叉树
 *
 * @author kimtian
 */
public class ArrayBinaryTree {
    /**
     * 一个存储树的数组
     */
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    /**
     * 前序遍历
     *
     * @param index 从哪个结点开始遍历
     */
    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //先遍历当前结点的内容
        System.out.print(data[index] + " ");
        //处理左子结点
        if (Constants.TWO * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        //处理右子结点
        if (Constants.TWO * index + Constants.TWO < data.length) {
            frontShow(2 * index + 2);
        }
    }

    /**
     * 前序遍历 重载方法
     */
    public void frontShow() {
        frontShow(0);
    }

    /**
     * 中序遍历
     *
     * @param index 从哪个结点开始遍历
     */
    public void middleShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //处理左子结点
        if (Constants.TWO * index + 1 < data.length) {
            middleShow(2 * index + 1);
        }
        //先遍历当前结点的内容
        System.out.print(data[index] + " ");
        //处理右子结点
        if (Constants.TWO * index + Constants.TWO < data.length) {
            middleShow(2 * index + 2);
        }
    }

    /**
     * 中序遍历
     */
    public void middleShow() {
        middleShow(0);
    }

    /**
     * 后序遍历
     *
     * @param index 从哪个结点开始遍历
     */
    public void behindShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //处理左子结点
        if (Constants.TWO * index + 1 < data.length) {
            behindShow(2 * index + 1);
        }
        //处理右子结点
        if (Constants.TWO * index + Constants.TWO < data.length) {
            behindShow(2 * index + 2);
        }
        //先遍历当前结点的内容
        System.out.print(data[index] + " ");
    }

    /**
     * 后序遍历
     */
    public void behindShow() {
        behindShow(0);
    }
}
