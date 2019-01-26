package cn.leetcode.easy.done;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组，返回两个数字的索引，使它们相加到特定目标。
 * <p>
 * 您可以假设每个输入只有一个解决方案，并且您可能不会两次使用相同的元素。
 * 例：
 * 数组nums = [2,7,11,15]，target = 9，
 * 因为nums [0] + nums [1] = 2 + 7 = 9，
 * 返回[0,1]。
 *
 * @author kimtian
 * @date 2019.01.22
 * @num 1
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1, -5, -7, 90};
        System.out.println(Arrays.toString(twoSumTwo(nums, -8)));

    }

    /**
     * 方法一
     * 想象两个指针，第一个指针从数组的0位开始，
     * 第二个指针从第一个指针的下一位开始向后循环，如果两个指针位置所在的值相加和为目标值，则返回两个指针的坐标。
     *
     * @param nums   数组
     * @param target 目标值
     * @return
     */
    public int[] twoSumOne(int[] nums, int target) {
        //返回结果为长度等于2的数组
        int[] returns = new int[2];
        //第一个指针从数组0位开始循环
        for (int i = 0; i < nums.length - 1; i++) {
            //第二个指针从第一个指针的下一位开始向后循环
            for (int j = i + 1; j < nums.length; j++) {
                //如果两个指针相加和为目标值
                if (nums[i] + nums[j] == target) {
                    //给返回的数组赋值，并将其返回
                    returns[0] = i;
                    returns[1] = j;
                    return returns;
                }
            }
        }
        return returns;
    }

    /**
     * 方法二
     * 创建一个map，key存放数组的值，value存放其所在位置
     * 创建一个指针，从数组的0位向后循环
     * 如果在map中 能找到目标值减去当前值的值，则将该值的value坐标 以及 指针所指位置的坐标返回
     * 如果没有找到，将其值和坐标放入map中
     *
     * @param nums   数组
     * @param target 目标值
     * @return
     */
    public static int[] twoSumTwo(int[] nums, int target) {
        //创建一个map，key存放数组的值，value存放其所在位置
        Map<Integer, Integer> m = new HashMap<>();
        //创建一个指针，从数组的0位向后循环
        for (int i = 0; i < nums.length; i++) {
            // 如果在map中 能找到目标值减去当前值的值，则将该值的value坐标 以及 指针所指位置的坐标返回
            if (m.get(target - nums[i]) != null) {
                return new int[]{m.get(target - nums[i]), i};
            }
            // 如果没有找到，将其值和坐标放入map中
            m.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

}
