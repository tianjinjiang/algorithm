package cn.kimtian.sort;

import java.util.Arrays;

/**
 * 这是一个冒泡排序算法
 *
 * @author kimtian
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 9, 4, 1, 23, 4, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     * 共需要比较length-1 轮
     * 如果两个数相比，第一个数>第二个数，则交换位置
     * 若第一个数< 第二个数 ,则不动
     * {5,7,2,9,4,1,23,4,0}
     * 第一轮：{5,2,7,4,1,9,4,0,23}
     * 第二轮：{2,5,4,1,7,4,0,9,23}
     * 第三轮：{2,4,1,5,4,0,7,9,23}
     * 第四轮：{2,1,4,4,0,5,7,9,23}
     * 第五轮：{1,2,4,0,4,5,7,9,23}
     * 第六轮：{1,2,0,4,4,5,7,9,23}
     * 第七轮：{1,0,2,4,4,5,7,9,23}
     * 第八轮：{0,1,2,4,4,5,7,9,23}
     *
     * @param arr 需要排序的数组
     */
    public static void bubbleSort(int[] arr) {
        //控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //控制比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int mid = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = mid;
                }
            }
        }
    }
}