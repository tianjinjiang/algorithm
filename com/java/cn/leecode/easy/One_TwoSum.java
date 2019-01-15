package cn.leecode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组，返回两个数字的索引，使它们相加到特定目标。
 * 您可以假设每个输入只有一个解决方案，并且您可能不会两次使用相同的元素。
 * 例：
 * 鉴于nums = [2,7,11,15]，target = 9，
 * 因为nums [0] + nums [1] = 2 + 7 = 9，
 * 返回[0,1]。
 *
 * @author kimtian
 */
public class One_TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1, -5, -7, 90};
        System.out.println(Arrays.toString(twoSumTwo(nums, -8)));

    }

    /**
     * 方法一
     *
     * @param nums   数组
     * @param target 目标值
     * @return
     */
    public int[] twoSumOne(int[] nums, int target) {
        int[] returns = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
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
     *
     * @param nums   数组
     * @param target 目标值
     * @return
     */
    public static int[] twoSumTwo(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        System.out.println(m.values());
        System.out.println(m.equals(null));
        System.out.println(m.get(-7));
        for (int i = 0; i < nums.length; i++) {
            if (m.get(target - nums[i]) != null) {
                return new int[]{m.get(target - nums[i]), i};
            }
            m.put(nums[i], i);
            for (Map.Entry<Integer, Integer> aa : m.entrySet()) {
                System.out.println("!!!" + aa.getKey() + "," + aa.getValue());
            }

        }
        return new int[]{0, 0};
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.println("i:" + i);
            }
        }
        for (int j = 0; j < arr.length && arr[j] <= 0; j++) {
            System.out.println("j:" + j);
        }
    }
}
