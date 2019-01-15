package cn.kimtian.sort;

import java.util.Arrays;

/**
 * 堆排序
 *
 * @author kimtian
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 8, 7, 0, 1, 10, 4, 2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 堆排序算法
     *
     * @param arr
     */
    public static void heapSort(int[] arr) {
        //从开始位置进行调整，开始位置为最后一个非叶子结点，即最后一个结点的父结点
        int start = (arr.length - 1) / 2;
        //结束位置为数组的长度-1,循环调整数组为一个大顶堆
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }
        //调整成大顶堆之后我们把数组的第一个值挪到最后面，并固定住。
        //再把前面的处理为大顶堆
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr, i, 0);
        }
    }

    /**
     * 先将一个数组变为大顶堆的方法
     * 任意一个数组都可以变成一个完全二叉树，再将二叉树变为大顶堆
     * （1）从最后一个非叶子结点开始调整，拿着这个结点和子结点对比，如果不是最大的，则交换位置。
     * （2）再处理下一个非叶子结点。以此类推。
     *
     * @param arr   调整的数组
     * @param size  调整数组的哪里一部分
     * @param index 从数组的哪开始调整
     */
    public static void maxHeap(int[] arr, int size, int index) {
        //从index找到两个子结点
        int leftNode = 2 * index + 1;
        int rightNode = 2 * index + 2;
        int max = index;
        //和两个子结点分别对比，找出最大的结点
        if (leftNode < size && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode < size && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        //根据最大值来进行交换位置
        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            //交换位置后，可能会破坏之前排好的堆，所以，之前排好的堆需要重新调整
            maxHeap(arr, size, max);
        }


    }

}
