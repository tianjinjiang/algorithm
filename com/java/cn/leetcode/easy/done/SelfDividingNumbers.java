package cn.leetcode.easy.done;

import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self dividing number,
 * including the bounds if possible.
 *
 * @author kimtian
 * @date 2019.01.29
 * @num 728题
 */
public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        //创建一个存放返回自我分割数的结果集
        List<Integer> returnList = new ArrayList<>();
        //循环在left-right范围中的每一个数字
        for (int i = left; i <= right; i++) {
            //存放数字的每一位的集合。每个数字对应一个新的集合
            List<Integer> selefDivide = new ArrayList<>();
            //初始标识为true
            boolean flag = true;
            //将i赋值给z
            int z = i;
            //将i的每一位放入selefDivide集合中
            while (z > 0) {
                //如果是带0的数，则不可能为自我分割数，跳出循环
                if (z % 10 == 0) {
                    flag = false;
                    z = -1;
                    break;
                }
                //每次取其和十的余数
                selefDivide.add(z % 10);
                //每次把最小位数丢弃
                z = z / 10;
            }
            //循环整除其每一位数字，如果不能整除，则不为自我分割数
            for (int s : selefDivide) {
                if (i % s != 0) {
                    flag = false;
                }
            }
            //如果可以整除，将其放入返回结果集中
            if (flag == true) {
                returnList.add(i);
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        List<Integer> aaa = selfDividingNumbers2(1, 22);
        System.out.println(aaa.size() + "!");
        for (int a : aaa) {
            System.out.println(a);
        }
    }

    public static List<Integer> selfDividingNumbers2(int left, int right) {
        //创建一个存放返回自我分割数的结果集
        List<Integer> returnList = new ArrayList<>();
        //循环在left-right范围中的每一个数字
        for (int i = left; i <= right; i++) {
            //判断是否是自我分割数
            if (selfDividing(i)) {
                //是的话，加入返回结果集中
                returnList.add(i);
            }
        }
        return returnList;
    }

    /**
     * 判断是不是自身分割数
     *
     * @param i 待判断的数字
     * @return 是否是自身分割数
     */
    public static boolean selfDividing(int i) {
        //将int型数据的每一位进行拆分
        for (char c : String.valueOf(i).toCharArray()) {
            //如果有一位是0或者不能被自身整除，则返回false
            if (c == '0' || (i % (c - '0')) > 0) {
                return false;
            }

        }
        //否则返回true
        return true;
    }
}
