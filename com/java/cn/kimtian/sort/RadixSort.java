package cn.kimtian.sort;

import cn.kimtian.array.queue.MyQueue;

import java.util.Arrays;

/**
 * 基数排序
 *
 * @author kimtian
 */
public class RadixSort {
    public static void main(String[] args) {
        int arr[] = {45, 2, 67, 897, 102, 7, 508, 367, 42, 76, 34};
        RadixSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 基数排序算法
     * 第一次按个位排,结果如下：{2,102,42,34,45,76,67,897,367,508}
     * 第二次按十位排，结果如下：{2,102,7,508,34,42,45,67,367,76,897}
     * 第三次按百位排序：结果如下：{2,7,34,42,45,67,76,102,367,508,897}
     * 依次类推...
     */
    public static void RadixSort(int[] arr) {
        //存放数组中最大的数字
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //用于临时存储数据的数组
        int[][] temp = new int[10][arr.length];
        //用于记录在temp中相应的数组中存放的数字的数量
        int[] counts = new int[10];

        //计算最大数字是几位数
        int maxLength = (max + "").length();
        //根据最大长度的数决定比较次数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //把每一个数字分别计算余数
            for (int j = 0; j < arr.length; j++) {
                int ys = (int) (arr[j] / n % 10);
                temp[ys][counts[ys]] = arr[j];
                //记录数量
                counts[ys]++;
            }
            int index = 0;
            //把数字取出来
            for (int g = 0; g < counts.length; g++) {
                //记录数组中数据的值不为0，代表有数据
                if (counts[g] != 0) {
                    for (int z = 0; z < counts[g]; z++) {
                        //取出元素放入原来数组
                        arr[index] = temp[g][z];
                        index++;
                    }
                }
                //把数量置为0
                counts[g] = 0;
            }
        }

    }

    /**
     * 基数排序队列实现
     */
    public static void RadixSort2(int[] arr) {
        //存放数组中最大的数字
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //用于临时存储数据的队列数组
        MyQueue[] temp = new MyQueue[10];
        //为队列数组赋值
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new MyQueue();
        }

        //计算最大数字是几位数
        int maxLength = (max + "").length();
        //根据最大长度的数决定比较次数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //把每一个数字分别计算余数
            for (int j = 0; j < arr.length; j++) {
                int ys = (int) (arr[j] / n % 10);
                temp[ys].addQueue(arr[j]);
            }
            int index = 0;
            //把数字取出来
            for (int z = 0; z < temp.length; z++) {
                //当前遍历的队列不为空，则循环取
                while (!temp[z].isQueueEmpty()) {
                    arr[index] = (int) temp[z].pollQueue();
                    //记录下一个位置
                    index++;
                }
            }
        }
    }
}
