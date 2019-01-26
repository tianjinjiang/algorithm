package cn.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome Number
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * @author kimtian
 */
public class PalindromeNumber {
    /**
     * 回文数
     * 解题思路：
     * （1）小于0的不是回文数，因为有负号。
     * （2）大于0，但刚好是10的整数倍的
     * （3）将每一位拆到数组中，然后判断数组的0位和最后一位，1位和n-1位，2位和n-2位......是否一致。
     *
     * @param x 待判断的整型数
     * @return 是否是回文数
     */
    public static boolean isPalindrome(int x) {
        boolean flag = false;
        //如果x<0,则表示x为负数，负数有负号不可能为回文数
        if (x < 0) {
            return false;
        }
        //如果x不为0，且x除10没有余数，则表示x为0结尾的正数，那么翻转之后不可能为回文数
        if (x % 10 == 0 && x != 0) {
            return false;
        }
        //创建一个存放每一位元素的集合
        List numlist = new ArrayList();
        while (x > 0) {
            //x%10的余数放入集合列表中
            numlist.add(x % 10);
            //每次除10，相当于把最小的位丢掉，因为已经存在集合列表中了
            x /= 10;
        }
        for (int i = 0; i < numlist.size() / 2; i++) {
            // 判断数组的0位和最后一位，1位和倒数第二位，2位和倒数第三位......是否相同，不相同则直接返回false
            if (!(numlist.get(i) == numlist.get(numlist.size() - i - 1))) {
                return flag;
            }
        }
        flag = true;
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12222421));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(10));
    }
}
