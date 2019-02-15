package cn.leetcode.easy.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * @author kimtian
 * @date 2019.01.30
 * @num 448
 */
public class Find_All_Numbers_Disappeared_in_an_Array {
    /**
     * 方法一：
     * 写一个判断是否出现在数组中的方法，传入判断的数字，和数组。
     * for循环1-nums.length区间中的每一个数据，使用判断是否存在数组中的方法来判断。
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //存放返回结果的列表
        List<Integer> returnList = new ArrayList<>();
        //数组中应该存在的值，从1开始到数组的长度终止
        for (int i = 1; i <= nums.length; i++) {
            //不存在数字放入返回结果集中
            if (find(i, nums)) {
                returnList.add(i);
            }
        }
        return returnList;
    }

    /**
     * 查找数组中是否存在该值的方法
     * @param j    要找的数字
     * @param nums 查找的数组
     * @return 是否存在该值
     */
    public static boolean find(int j, int[] nums) {
        Math.abs(j);
        //循环数组
        for (int i = 0; i < nums.length; i++) {
            //如果存在相同的值，则返回false
            if (j == nums[i] + 1) {
                return false;
            }
        }
        //不存在返回true
        return true;
    }

    /**
     * 方法二：
     * 和方法一类似。使用java8的特性，将其转化成list集合，然后通过list的contains方法判断该数字是否存在于数组中。
     * @param nums 数组
     * @return
     */
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        //将数组转化成一个list
        List list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        //存放返回结果的列表
        List<Integer> returnList = new ArrayList<>();
        //循环1-nums.length间应该出现的数字
        for (int i = 1; i <= nums.length; i++) {
            //如果列表中未包含，则加入返回结果集中
            if (!list.contains(i)) {
                returnList.add(i);
            }
        }
        return returnList;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5};
        List<Integer> aa = findDisappearedNumbers2(a);
        for (Integer aaa : aa) {
            System.out.println(aaa);
        }
    }
}
