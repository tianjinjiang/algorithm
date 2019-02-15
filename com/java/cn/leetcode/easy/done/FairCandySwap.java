package cn.leetcode.easy.done;

import java.util.Arrays;

/**
 * Alice and Bob have candy bars of different sizes:
 * A[i] is the size of the i-th bar of candy that Alice has,
 * and B[j] is the size of the j-th bar of candy that Bob has.
 * Since they are friends, they would like to exchange one candy bar each so that after the exchange,
 * they both have the same total amount of candy.
 * (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange,
 * and ans[1] is the size of the candy bar that Bob must exchange.
 * If there are multiple answers, you may return any one of them.
 * It is guaranteed an answer exists.
 *
 * @author kimtian
 * @date 2019.02.03
 * @num 888
 */
public class FairCandySwap {
    /**
     * 先算出目前Alice和Bob糖果的总数，
     * 然后双重循环，依次交换Alice和Bob手里的糖果，
     * 直到双方糖果总数相同，返回交换的糖果
     *
     * @param A Alice手里的糖果
     * @param B Bob手里的糖果
     * @return 可以交换的糖果
     */
    public static int[] fairCandySwap(int[] A, int[] B) {
        //定义一个返回交换结果的数组
        int[] a = new int[2];
        //计算Alice最初拥有的糖果的总数
        int sumA = 0;
        for (int i : A) {
            sumA += A[i];
        }
        //计算Bob最初拥有的糖果的总数
        int sumB = 0;
        for (int i : B) {
            sumB += B[i];
        }
        //循环Alice手里的糖果
        for (int i = 0; i < A.length; i++) {
            //循环Bob手里的糖果
            int j = 0;
            while (j < B.length) {
                //如果将Alice和Bob手里的糖果交换，两人手里的糖果数相同，则记录为true
                boolean flag = sumA - A[i] + B[j] == sumB - B[j] + A[i];
                //并将当前结果返回，终止循环
                if (flag) {
                    a[0] = A[i];
                    a[1] = B[j];
                    return a;
                }
                //否则继续尝试交换糖果
                else {
                    j++;
                }
            }
        }
        //如果没有合适的则返回空数组
        return a;
    }

    /**
     * 测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        int a[] = new int[]{2};
        int b[] = new int[]{1, 3};
        System.out.println(Arrays.toString(fairCandySwap(a, b)));
    }
}