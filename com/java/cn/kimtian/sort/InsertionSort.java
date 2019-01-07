package cn.kimtian.sort;

import java.util.Arrays;

/**
 * 这是一个插入排序算法
 *
 * @author kimtian
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 0, 7, 4, 2, 1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 这是一个插入排序算法
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        //遍历所有的数字
        for (int i = 1; i < arr.length; i++) {
            //如果当前数字比前一个数字小
            if (arr[i - 1] > arr[i]) {
                int mid = arr[i];
                for (int j = i - 1; j >= 0 && arr[j] > mid; j--) {
                    int temp = arr[j];
                    //交换位置
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
