package cn.kimtian.normalalgorithm;

import cn.kimtian.Constants;

/**
 * 斐波那契数列
 *
 * @author kimtian
 */
public class TestFebonacci {
    public static void main(String[] args) {
        //斐波那契数列1,1,2,3,5,8,13,21,34,55,89,144,233……
        System.out.println(febonacci(13));
    }

    public static int febonacci(int i) {
        //前两个值都是1
        if (i <= Constants.TWO) {
            return 1;
        }
        //第三项开始为前两项的和
        else {
            return febonacci(i - 1) + febonacci(i - 2);
        }
    }

}
