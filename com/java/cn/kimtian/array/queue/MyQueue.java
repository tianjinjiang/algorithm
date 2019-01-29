package cn.kimtian.array.queue;

import java.util.Arrays;

/**
 * 队列的操作
 *
 * @author kimtian
 */
public class MyQueue {
    /**
     * 队列的底层我们可以使用数组来存储数据
     */
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    /**
     * 入队操作
     *
     * @param element 入队元素
     */
    public void addQueue(int element) {

        // 创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        // 把原数组中的元素复制到新的数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        // 把添加的元素放入新数组中
        newArr[elements.length] = element;
        // 使用新数组替换老数组
        elements = newArr;
    }

    /**
     * 出队操作
     */
    public int pollQueue() {
        // 栈是空的
        if (elements.length == 0) {
            throw new RuntimeException("queue is empty!");
        }
        // 把数组的0的位置的元素取出来
        int element = elements[0];
        // 创建一个新的数组
        int[] newArr = new int[elements.length - 1];

        // 把原数组中的元素复制到新的数组中
        for (int i = 1; i < elements.length; i++) {
            newArr[i - 1] = elements[i];
        }
        // 使用新数组替换老数组
        elements = newArr;
        return element;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isQueueEmpty() {
        return elements.length == 0;
    }

    /**
     * 展示队列的所有元素
     */
    public void showQueue() {
        System.out.println(Arrays.toString(elements));
    }
}
