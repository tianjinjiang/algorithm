package cn.kimtian.sort;

import java.util.Arrays;

/**
 * 这是以一个快速排序算法
 *
 * @author kimtian
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 8, 9, 5, 1, 2, 6};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 快速排序
     *
     *
     * {3,5,7,8,9,5,1,2,6}
     * 第一轮：{3,5,7,8,9,5,1,2,6}
     * 第二轮：{1,2,3,5,7,8,9,5,6}
     * 第三轮：{2,4,1,5,4,0,7,9,23}
     * 第四轮：{2,1,4,4,0,5,7,9,23}
     * 第五轮：{1,2,4,0,4,5,7,9,23}
     * 第六轮：{1,2,0,4,4,5,7,9,23}
     * 第七轮：{1,0,2,4,4,5,7,9,23}
     * 第八轮：{0,1,2,4,4,5,7,9,23}
     *
     * @param arr 需要排序的数组
     */

    public static void quickSort(int[] arr){

    }
}
