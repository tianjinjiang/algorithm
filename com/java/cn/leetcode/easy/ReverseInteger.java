package cn.leetcode.easy;

/**
 * @author kimtian
 * @date 2019.02.15
 * @num 7
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int returnNum = 0;
        String fz = "";
        if (x < 0) {
             fz = "-"+reverse(x + "");
        } else {
             fz = reverse(x + "");

        }
        if(Integer.parseInt(fz)>Integer.MAX_VALUE){
            returnNum = 0;
        }
        returnNum = Integer.parseInt(fz);
        return returnNum;
    }

    public static String reverse(String x) {
        char[] chars = x.toCharArray();
        StringBuffer s = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != '-') {
                s.append(chars[i]);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(120));
        System.out.println(reverse(-120));
    }

}
