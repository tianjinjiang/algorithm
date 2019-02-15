package cn.leetcode.easy.done;

import java.util.Arrays;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 *
 * @author kimtian
 * @date 2019.01.31
 * @num 905
 */
public class Sort_Array_By_Parity {
    /**
     * 题目没有说不让使用额外空间，而且只要求偶数在前，奇数灾后在后，没有要求奇偶数的顺序。
     * 所以我们新建一个数组，和原数组长度一致。
     * 然后循环原数组，判断是偶数，则从新数组的前面向后面放，如果是奇数，则从新数组的后面向前面放。
     * 这样只循环一次，效率比较高。
     *
     * @param A 待排序数组
     * @return 排序后数组
     */
    public static int[] sortArrayByParity(int[] A) {
        //创建一个新数组
        int[] newInt = new int[A.length];
        //定义一个新数组从头开始的指针
        int j = 0;
        //定义一个从新数组尾巴开始的指针
        int z = newInt.length - 1;
        //循环拿出老数组的数据
        for (int i = 0; i < A.length; i++) {
            //如果是偶数，则从数组的前往后放数据
            if (A[i] % 2 == 0) {
                //放入数据
                newInt[j] = A[i];
                //移动指针
                j++;
            }
            //奇数从从后往前放数据
            else {
                //放入数据
                newInt[z] = A[i];
                //移动指针
                z--;
            }
        }
        return newInt;

    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 5, 4, 2, 6, 7, 8, 0};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }
}
