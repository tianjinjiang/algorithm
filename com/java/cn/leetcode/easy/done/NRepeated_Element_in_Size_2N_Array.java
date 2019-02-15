package cn.leetcode.easy.done;

import java.util.HashMap;
import java.util.Map;

/**
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * Return the element repeated N times.
 *
 * @author kimtian
 * @date 2039.01.18
 * @num 961
 */
public class NRepeated_Element_in_Size_2N_Array {
    /**
     * 这题主要是找到重复的元素，因为数组长度为2N，有N+1个元素，所以可以确定N个元素只出现1次，只有1个元素出现N次。
     * 所以我们找到出现次数大于1的元素。
     * 把数组循环放入map中，然后找到map的value为N的元素返回。
     *
     * @param A 数组
     * @return 重复元素
     */
    public static int repeatedNTimes(int[] A) {
        //创建一个map存放数组元素和其出现次数
        Map<Integer, Integer> Amap = new HashMap<>();
        //循环数组元素，将数组中的元素和出现次数放入map中，
        for (int i = 0; i < A.length; i++) {
            //如果map中有，则在其原始value的基础上+1
            if (Amap.containsKey(A[i])) {
                Amap.put(A[i], Amap.get(A[i]) + 1);
            }
            //没有，则将其放入map中，value为1，表示只出现一下
            else {
                Amap.put(A[i], 1);
            }
        }
        /**
         *  也可以这样将数组元素和出现次数放入map中
         *  for (int i : A) {
         *     Amap.put(i, Amap.getOrDefault(i, 0) + 1);
         *  }
         */
        //循环map的key元素集合
        for (int j : Amap.keySet()) {
            //并根据key值获取其value值，即出现的次数，如果出现次数超过1次，则表示是我们要找的元素，将其返回
            if (Amap.get(j) > 1) {
                return j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 3};
        System.out.println(repeatedNTimes(a));
    }
}
