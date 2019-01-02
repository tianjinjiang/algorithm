package cn.kimtian.array.one;

/**
 * 这是数组的线性查找
 *
 * @author kimtian
 */
public class TestLinearSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arrOne = new int[]{1, 2, 3, 4, 5, 6};
        //目标元素
        int targetNum = 5;
        //目标元素所在的下标
        int index = -1;
        //遍历数组
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == targetNum) {
                index = i;
                //找到则停止，不继续循环
                break;
            }
        }
        System.out.println("目标元素所在下标为：" + index);

    }
}
