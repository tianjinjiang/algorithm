package cn.kimtian.array.one;

import java.util.Arrays;

/**
 * 由于数组的长度是不可变的，那么想为数组增加元素就需要进行：
 * 1.新建另一个数组
 * 2.把原数组中的元素复制到新数组中
 * 3.把新增加的元素加入新数组的最后
 * 4.使用新数组替换原有数组
 *
 * @author kimtian
 */
public class OptionArrayAdd {
    public static void main(String[] args) {
        /**
         * 数组的长度是不可变的,如下面就指定了数组a的长度为5
         */
        int a[] = new int[]{1, 2, 3, 4, 5};
        // 快速查看数组中的元素
        System.out.println("原来的数组：" + Arrays.toString(a));
        //要新加的元素
        int addNum = 9;

        // 创建一个新的数组，长度是原数组长度+1
        int newA[] = new int[a.length + 1];
        // 把原数组中的元素复制到新数组中
        for (int i = 0; i < a.length; i++) {
            newA[i] = a[i];
        }
        // 把目标元素放入新数组的最后
        newA[newA.length - 1] = addNum;
        // 新数组替换原数据
        a = newA;
        System.out.println("现在的数组：" + Arrays.toString(a));
    }
}
