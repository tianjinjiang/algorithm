package cn.leetcode.easy.done;

import java.util.Arrays;

/**
 * Given a matrix A, return the transpose of A.
 * The transpose of a matrix is the matrix flipped over it's main diagonal,
 * switching the row and column indices of the matrix.
 *
 * @author kimtian
 * @date 2019.02.02
 * @num 867
 */
public class TransposeMatrix {
    /**
     * 创建一个新数组接收原来数组的值,
     * 原来数组的纵向长度为新数组的横向长度，原数组的横向长度为现数组的纵向长度
     * 原数组的（i，j）坐标变为现数组的（j，i）坐标
     *
     * @param A 待转置的数组
     * @return
     */
    public static int[][] transpose(int[][] A) {
        //创建一个新数组，用来接收返回数据，原来数组的纵向长度为新数组的横向长度，原数组的横向长度为现数组的纵向长度
        int[][] newArr = new int[A[0].length][A.length];
        //遍历原数组的值，将其放入新数组中
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                //原数组的（i，j）坐标的值变为现数组的（j，i）坐标的值
                newArr[j][i] = A[i][j];
            }
        }
        //返回新数组
        return newArr;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(transpose(a)));
    }
}
