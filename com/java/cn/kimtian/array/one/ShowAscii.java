package cn.kimtian.array.one;

import cn.kimtian.Constants;

/**
 * 使用for循环展示ASCII码
 *
 * @author kimtian
 */
public class ShowAscii {
    public static void main(String[] args) {
        String temp = "";
        for (int i = Constants.ASCII_LOW; i <= Constants.ASCII_HEIGHT; i++) {
            temp = i < 100 ? "0" + i : "" + i;
            System.out.print(temp + "=" + (char) i + "  ");
            if ((i - 31) % 8 == 0) {
                System.out.println();
            }
        }
    }
}
