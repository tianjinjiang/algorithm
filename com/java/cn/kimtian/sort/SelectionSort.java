package cn.kimtian.sort;

import java.util.Arrays;

/**
 * 这是以一个选择排序算法
 *
 * @author kimtian
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 3, 3, 2, 0};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println("==================");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 这是一个选择排序方法（采用递归的方式）
     *
     * @param arr 数组
     */
    public static void selectionSort(int[] arr, int start) {
        if (start < arr.length) {
            int small = arr[start];
            int index = start;
            for (int i = start; i < arr.length; i++) {
                if (arr[i] < small) {
                    small = arr[i];
                    index = i;
                }
            }
            int middle = arr[start];
            arr[start] = arr[index];
            arr[index] = middle;
            start++;
            selectionSort(arr, start);
        }
    }

    /**
     * 这是一个选择排序方法
     *
     * @param arr 数组
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            //把当前遍历的数和后面所有的数依次进行比较，并记录最小数的下标
            for (int j = i + 1; j < arr.length; j++) {
                //如果后面比较的数比记录的最小数小，记录最小数的下标
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致,说明下标为minIndex的数比当前遍历的数更小
            if (i != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
