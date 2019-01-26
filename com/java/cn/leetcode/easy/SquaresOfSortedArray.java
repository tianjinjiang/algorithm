package cn.leetcode.easy;

import java.util.Arrays;

/**
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted non-decreasing order.
 *
 * @author kimtian
 */
public class SquaresOfSortedArray {
    /**
     * 将数组每个元素进行平方，并按递增方式排序
     *
     * @param A 原数组
     * @return 新数组
     */
    public static int[] squaresOfSortedArray(int[] A) {
        //将数组的每一个元素进行平方
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        /**
         * 直接用jdk自带的排序方法
         */
        Arrays.sort(A);
        return A;
    }

    /**
     * 测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(squaresOfSortedArray(a)));
    }



}
