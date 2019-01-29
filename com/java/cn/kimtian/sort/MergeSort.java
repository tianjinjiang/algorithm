package cn.kimtian.sort;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author kimtian
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 8, 0, 7, 4, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int hight) {
        int middle = (hight + low) / 2;
        //递归的结束条件
        if (low < hight) {
            //处理左边
            mergeSort(arr, low, middle);
            //处理右边
            mergeSort(arr, middle + 1, hight);
            //归并
            merge(arr, low, middle, hight);
        }
    }

    /**
     * 合并
     */
    public static void merge(int[] arr, int low, int middle, int high) {
        //用于存储归并后的临时数组
        int[] temp = new int[high - low + 1];
        //记录第一个数组中需要遍历的下标
        int i = low;
        //记录第二个数组中需要遍历的下标
        int j = middle + 1;
        //用于记录在临时数组中存放的下标
        int index = 0;
        //遍历两个数组，取出小的数字放入临时文件中
        while (i <= middle && j <= high) {
            //如果第一个数组的最小值，小于等于第二个数组的最小值，则把i放入临时数组中
            if (arr[i] <= arr[j]) {
                temp[index] = arr[i];
                i++;
            }
            //第二个数组的数据更小，把第二个数组的数据j放入临时数组中
            else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        //处理多余的数据
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }
        while (i <= middle) {
            temp[index] = arr[i];
            i++;
            index++;
        }

        //把临时数组中的数据重新存入原数组
        for (int k = 0; k < temp.length; k++) {
            arr[k + low] = temp[k];
        }
    }
}
