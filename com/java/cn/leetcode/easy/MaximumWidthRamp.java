package cn.leetcode.easy;

import java.util.Arrays;

/**
 * Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j].  The width of such a ramp is j - i.
 * Find the maximum width of a ramp in A.  If one doesn't exist, return 0.
 * Example 1:
 * Input: [6,0,8,2,1,5]
 * Output: 4
 * Explanation:
 * The maximum width ramp is achieved at (i, j) = (1, 5): A[1] = 0 and A[5] = 5.
 * Example 2:
 * Input: [9,8,1,0,1,9,4,0,4,1]
 * Output: 7
 * Explanation:
 * The maximum width ramp is achieved at (i, j) = (2, 9): A[2] = 1 and A[9] = 1.
 * Note:
 * 2 <= A.length <= 50000
 * 0 <= A[i] <= 50000
 *
 * @author kimtian
 */
public class MaximumWidthRamp {
    /**
     * 最大宽度斜坡
     *
     * @param A 数组
     * @return int 返回最大宽度
     */
    public static int maxWidthRamp(int[] A) {
        int maxWidth = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j >= i; j--) {
                if (A[i]<=A[j]&&j-i>maxWidth){
                    maxWidth = j - i;
                }
            }
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        int[] A = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(A));

        aa(A);
    }
    public static void aa(int[] A){
        System.out.println(Arrays.toString(A));
        Integer[] B = new Integer[A.length];
        for (int i = 0; i < A.length; ++i){
            B[i] = i;
        }
        Arrays.sort(B, (i, j) -> ((Integer) A[i]).compareTo(A[j]));
        System.out.println("A:"+Arrays.toString(A));
        System.out.println("B:"+Arrays.toString(B));
    }
}
