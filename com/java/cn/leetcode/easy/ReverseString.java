package cn.leetcode.easy;

/**
 * @author kimtian
 * @num 344
 * @date 2019.03.07
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        reverseString(a);
        System.out.println(a);
    }

    public static void reverseString(char[] s) {
        int a = s.length;
        for (int i = 0; i < a / 2 - 1; i++) {
            char middle = 0;
            middle = s[i];
            s[i] = s[a - 1 - i];
            s[a - 1 - i] = middle;
        }

    }
}
