package cn.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 中文：
 给定一个数组nums，写一个函数将所有0移动到它的末尾，同时保持非零元素的相对顺序。
 Example:
 Input: [0,1,0,3,12]
 Output: [1,3,12,0,0]
 注意：
 您必须就地执行此操作，而无需复制阵列。
 最小化操作总数
 */
/**
 *
 英文：
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 Example:
 Input: [0,1,0,3,12]
 Output: [1,3,12,0,0]
 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 */

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @author kimtian
 */
public class MoveZeroes {
    /**
     * 解题思路：
     * 由于题干说您必须就地执行此操作，而无需复制阵列。
     * 还要保持非0数据的相对位置。
     * 所以采用类似冒泡排序的方法，如果值为0，则和其后面的数字交换位置，将0的数据冒泡到最后。
     * 并在此基础上优化，减少外层循环次数，有几个0只需要循环几次。
     *
     * @param nums
     * @date
     */
    public static void moveZeroes(int[] nums) {
        //创建一个变量记录数组中值为0的个数
        int zeroNums = 0;
        //循环数组，确定数组中值为0的个数
        for (int z = 0; z < nums.length; z++) {
            if (nums[z] == 0) {
                zeroNums++;
            }
        }
        //冒泡排序外层为控制比较的轮数，由于有zeroNums个0，所以只需要循环zeroNums次
        for (int i = 0; i < zeroNums; i++) {
            //控制比较的次数
            for (int j = 0; j < nums.length - 1 - i; j++) {
                //当数值为0，则交换和后面数字位置
                if (nums[j] == 0) {
                    int mid = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = mid;
                }
            }
        }
    }

    /**
     * 忽略题干不让复制数组，采用复制数组的方法进行处理
     * 0的数字记录一下，非0的记录在另外一个数组，重新拼接一下
     * 这样时间复杂度更好。
     *
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        //创建一个非0数组存放非0的数据
        List<Integer> unZeroList = new ArrayList<>();
        //循环数组
        for (int z = 0; z < nums.length; z++) {
            //如果值不为0，则在非0数组中添加该数据
            if (nums[z] != 0) {
                unZeroList.add(nums[z]);
            }
        }
        //循环原始数组，修改其值
        for (int j = 0; j < nums.length; j++) {
            //如果在非0数组的范围内，则将非0数组的相应值赋给它
            if (j < unZeroList.size()) {
                nums[j] = unZeroList.get(j);
            }
            //剩余末尾的其他位置赋值为0
            else {
                nums[j] = 0;
            }
        }
    }
    public String toLowerCase(String str) {
        if (str != null && str.length() > 0) {
            return str.toLowerCase();
        }
        return str;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] aa = new int[]{0, 1, 0, 3, 12};
        moveZeroes2(aa);
        System.out.println(Arrays.toString(aa));
    }
}
