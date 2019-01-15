package cn.kimtian.array.stack;

/**
 * 对栈的操作
 * 由于栈有先进后出的特性
 * 所以我们考虑若 每次为数组增加元素，加在数组的最后一位，每次取数据也从数组的最后一位取。
 * 就保证了先进后出。实现了栈的特性。
 *
 * @author kimtian
 */
public class MyStack {
    /**
     * 栈的底层我们使用数组来存储数据
     */
    int[] elements;

    /**
     * 初始化栈
     */
    public MyStack() {
        elements = new int[0];
    }

    /**
     * 压入元素方法
     *
     * @param element 入栈数据
     */
    public void pushStack(int element) {
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
     * 取出栈顶元素
     */
    public int popStack() {
        // 栈是空的
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty!");
        }

        // 取出数组的最后一个元素
        int element = elements[elements.length - 1];
        // 创建一个新的数组
        int[] newArr = new int[elements.length - 1];
        // 把原数组中除了最后元素的其他元素都放入新数组中
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        // 使用新数组替换老数组
        elements = newArr;
        // 返回栈顶元素
        return element;
    }

    /**
     * 清空栈
     */
    public void cleanStack() {
        elements = new int[0];
    }

    /**
     * 查看栈顶元素
     */
    public int peekStack() {
        // 栈是空的
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty!");
        }
        // 取出数组的最后一个元素
        int element = elements[elements.length - 1];
        return element;
    }

    /**
     * 判断栈是否为空
     */
    public boolean isStackEmpty() {
        return elements.length == 0;
    }
}

