package cn.kimtian.sort;

import cn.kimtian.Constants;

import java.util.Arrays;

/**
 * 这是一个希尔排序
 *
 * @author kimtian
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 1, 8, 3, 9, 0};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 这是一个希尔排序
     * {1,5,3,7,2,8,3,9,0}
     *
     * @param arr 数组
     *            初始：{2,5,3,7,1,8,3,9,0}
     *            第一轮：{0,5,3,7,1,8,3,9,2};
     *            第二轮：{0,5,1,7,2,8,3,9,3};
     *            第三轮：{0,1,2,3,3,5,7,8,9};
     */
    public static void shellSort(int[] arr) {
        for (int d = arr.length / Constants.TWO; d > 0; d /= Constants.TWO) {
            //遍历所有的元素
            for (int i = d; i < arr.length; i++) {
                //遍历本组中所有的元素
                for (int j = i - d; j >= 0; j -= d) {
                    //如果当前元素大于加上步长后的元素
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }

            }
        }

    }
}
