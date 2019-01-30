package cn.leetcode.easy.done;

import java.util.Arrays;

/**
 * Given a binary matrix A, we want to flip the image horizontally,
 * then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 *
 * @author kimtian
 * @date 2019.01.19
 * @num 832
 */
public class FlippingAnImage {
    /**
     * 这是一个处理二维数组的问题，对二维数组进行两次操作。
     * 新建一个数组，和原数组大小一样。用来存放数据。
     * 第一次水平翻转，将二维数组中的每一行数组 顺序变换，由首->尾，变为尾->首的顺序。
     * 第二次将上一步变换的数组，值为0的变为1，值为1的变为0.
     * 所以我们可以知道新数组首->尾应该为原数组尾->首（同时，如果是0则变为1，是1则变为0）
     *
     * @param A 待翻转的二维数组
     * @return 处理后的数组元素
     */
    public static int[][] flipAndInvertImage(int[][] A) {
        //新建一个数组，和原数组大小一样。用来存放数据。
        int newArr[][] = new int[A.length][A[0].length];
        //将每个子数组翻转，数组的最后一个值变为第一个
        for (int i = 0; i < A.length; i++) {
            int z = 0;
            //从尾部开始循环，并将值从新数组的头部开始一个个放入
            for (int j = A[i].length - 1; j >= 0; j--) {
                //新数组首->尾是为原数组尾->首（同时，如果是0则变为1，是1则变为0）
                //如果是0，则赋值1
                if (A[i][j] == 0) {
                    newArr[i][z] = 1;
                }
                //如果是1，则变为0
                else {
                    newArr[i][z] = 0;
                }
                z++;
            }
        }
        return newArr;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        int A[][] = new int[][]{
                {1, 1, 0}, {1, 0, 1}, {0, 0, 0}
        };
        System.out.println(Arrays.toString(flipAndInvertImage(A)));
    }
}
