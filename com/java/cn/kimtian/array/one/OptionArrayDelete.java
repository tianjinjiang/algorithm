package cn.kimtian.array.one;

import java.util.Arrays;

/**
 * 由于数组的长度是不可变的，那么想为数组删除元素就需要进行：
 * 1.新建另一个数组
 * 2.把原数组中的不需要删除的元素复制到新数组中
 * 3.使用新数组替换原有数组
 *
 * @author kimtian
 */
public class OptionArrayDelete {
    public static void main(String[] args) {
        /**
         * 数组的长度是不可变的,如下面就指定了数组a的长度为5
         */
        int[] a = new int[]{1, 2, 3, 4, 5, 7, 9};
        // 快速查看数组中的元素
        System.out.println("原来的数组：" + Arrays.toString(a));
        //要删除的元素的下标
        int deleteNum = 6;

        // 创建一个新的数组，长度是原数组长度-1
        int[] newA = new int[a.length - 1];
        // 把原数组中的除了要删除的元素的其他元素复制到新数组中
        for (int i = 0; i < newA.length; i++) {
            //当前遍历下标小于要删除元素的下标
            if (i < deleteNum) {
                newA[i] = a[i];
            }
            // 要删除的元素之后的元素
            else {
                newA[i] = a[i + 1];
            }
        }
        // 新数组替换原数据
        a = newA;
        System.out.println("现在的数组：" + Arrays.toString(a));
    }
}
