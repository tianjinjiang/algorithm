package cn.kimtian.sort;

import java.util.Arrays;

/**
 * 这是以一个快速排序算法
 *
 * @author kimtian
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 6, 7, 2, 7, 2, 8, 0};
         int[] arr1 = new int[]{7, 7, 6, 8, 4};
        System.out.println(Arrays.toString(arr1));
        quickSort(arr1, 0, arr1.length - 1);
    }

    /**
     * 快速排序
     * <p>
     * <p>
     * {3, 4, 6, 7, 2, 7, 2, 8, 0}
     * 第一轮：{0, 2, 2, 3, 7, 7, 6, 8, 4}
     * 第二轮：{0, 2, 2, 3, 7, 7, 6, 8, 4}
     * 第三轮：{0, 2, 2, 3, 7, 7, 6, 8, 4}
     * 第四轮：{0, 2, 2, 3, 4, 6, 7, 7, 8}
     * 第五轮：{0, 2, 2, 3, 4, 6, 7, 7, 8}
     * 第六轮：{0, 2, 2, 3, 4, 6, 7, 7, 8}
     * 第七轮：{0, 2, 2, 3, 4, 6, 7, 7, 8}
     *
     * @param arr 需要排序的数组
     */

    public static void quickSort(int[] arr, int start, int end) {
        System.out.println(Arrays.toString(arr));
        //开始和结束标记中间一定要有元素
        if (start < end) {
            //先找到一个标准数，一般采用数组开始的数
            int stard = arr[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            //循环找比标准数大的数和比标准数小的数
            while (low < high) {
                //右边数比标注数大，直接向前移动
                while (low < high && stard <= arr[high]) {
                    high--;
                }
                //使用右边的数字替换左边的数字
                arr[low] = arr[high];
                //左边数比标注数小，直接向前移动
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            //把标准数赋给重合位置所在的元素
            arr[low] = stard;
            //处理所有小的数字
            quickSort(arr, start, low);
            //处理所有大的数字
            quickSort(arr, low + 1, end);
        }
    }
}
