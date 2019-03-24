package cn.leetcode.difficult;

/**
 * 有两个排序的数组nums1和nums2分别为m和n。
 * 找到两个排序数组的中位数。总运行时间复杂度应为O（log（m + n））。
 * 您可以假设nums1和nums2不能都为空。
 *
 * @author kimtian
 */
public class Four {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge(nums1, nums2);
        if ((nums1.length + nums2.length) % 2 != 0) {

        }
        return 0;
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
