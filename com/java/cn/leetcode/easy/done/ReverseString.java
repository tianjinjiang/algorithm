package cn.leetcode.easy.done;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 *
 * @author kimtian
 * @num 344
 * @date 2019.03.07
 */
public class ReverseString {
    /**
     * 测试类
     * @param args
     */
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        //反转字符串
        reverseString(a);
        //打印翻转结果
        System.out.println(a);
    }

    /**
     * 将字符串（数组）一分为二，
     * 第一部分的第一个和第二部分的最后一个相对应，将其交换位置
     * 并以此类推
     *
     * 反转字符串的函数
     * @param s 待反转的字符串
     */
    public static void reverseString(char[] s) {
        int length = s.length;
        //将数组分为两部，并依次循环
        for (int i = 0; i < length / 2; i++) {
            //设置一个中间数记录数据
            char middle = 0;
            //交换头尾元素
            middle = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = middle;
        }

    }
}
