package cn.leetcode.easy.done;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * @author kimtian
 * @date 2019.01.25
 * @num 136
 */
public class SiingleNumber {
    /**
     * 解题思路：
     * 由于题干说：你能不用额外的内存来实现吗？
     * 所以没有新建map或List去记录数组，只打了一个标记。
     * 从数组的第一个数字开始，取数组的每一个值和它进行比较，如果有相同的数就为其打上相同的标记，然后继续查找下一个数。
     *
     * @param nums 数组
     * @return
     */
    public static int singleNumber(int[] nums) {
        //第一个指针，从数组的第一个值开始循环，循环到最后一个值
        for (int i = 0; i < nums.length; i++) {
            //初始标记都为false
            boolean flag = false;
            //另一个指针j，从0开始
            int j = 0;
            //循环到数组的最后一位
            while (j < nums.length) {
                //如果第二个指针的值和第一个指针指向的值不同，或者指针指向了同一个位置，则第二个指针向前移动一位
                if (nums[i] != nums[j] || j == i) {
                    j++;
                }
                //如果相同，则直接将标记置为false，并将第二个指针移出数组外，跳出循环
                else {
                    flag = true;
                    j = nums.length;
                    break;
                }
            }
            //如果整个数组中没有相同的元素，则表示是唯一数，返回该值
            if (flag == false) {
                return nums[i];
            }
        }
        //如果没有找到唯一的值,则返回-1
        return -1;
    }

    /**
     * 解题思路：
     * 忽略题干的不使用额外内存。
     * 用一个map记录这个数组，存放数组的值，key为值，value为出现的次数
     * 相应的时间复杂度会降低一些
     *
     * @param nums 数组
     * @return
     */
    public static int singleNumber2(int[] nums) {
        //创建一个map，存放数组的值，key为值，value为出现的次数
        Map<Integer, Integer> numsMap = new HashMap();
        //第一个指针，从数组的第一个值开始循环，循环到最后一个值
        for (int i = 0; i < nums.length; i++) {
            //判断map中是否有key为nums[i]的值，如果有，则在原始value值的基础上+1
            if (numsMap.containsKey(nums[i])) {
                int value = numsMap.get(nums[i]);
                numsMap.put(nums[i], value + 1);
            }
            //map中没有key为nums[i]的值，则在map中添加key为nums[i]，value为1，表示第一次出现
            else {
                numsMap.put(nums[i], 1);
            }
        }
        //循环遍历map中的值，value为1的表示只出现过1次的数，是唯一值，将其返回
        for (Map.Entry<Integer, Integer> aa : numsMap.entrySet()) {
            if (aa.getValue() == 1) {
                return aa.getKey();
            }
        }
        //如果没有找到唯一的值,则返回-1
        return -1;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber2(nums1));

    }
}
