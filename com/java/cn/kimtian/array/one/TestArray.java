package cn.kimtian.array.one;

/**
 * 数组数据结构
 *
 * @author kimtian
 **/
public class TestArray {
    public static void main(String[] args) {
        // 创建一个数组--三种方式
        // 第一种：只指定数组大小，不赋值。如果没有赋值，每个元素都是0
        int[] a = new int[3];
        // 第二种和第三种，创建数组的同时赋值
        int[] b = {1, 2, 3, 4};
        int[] c = new int[]{7, 8, 9};

        // 数组的长度(一共可以放多少元素)
        int aLength = a.length;

        // 获取数组中的元素，使用方式：数组名[下标] 下标从0开始,最大可以取到  数组的长度-1
        int a0 = a[0];

        // 数组元素赋值
        a[0] = 111;

        // 遍历数组
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
