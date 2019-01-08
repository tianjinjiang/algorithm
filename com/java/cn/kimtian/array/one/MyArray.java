package cn.kimtian.array.one;

import java.util.Arrays;

/**
 * 创建一个面向对象的可见数组
 * 并对其进行操作
 *
 * @author kimtian
 */
public class MyArray {
    /**
     * 目标数组，用于存储数据的数组
     **/
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    /**
     * /获取数组长度的方法
     *
     * @return int 数组的长度
     */
    public int size() {
        return elements.length;
    }

    /**
     * 往数组的末尾添加一个元素
     *
     * @param element 要添加的元素
     */
    public void add(int element) {
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
     * 打印所有元素到控制台
     */
    public void printToConsole() {
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 删除数组中的元素
     *
     * @param index 删除的下标
     */
    public void delete(int index) {
        //如果下标<0,或者大于最大边界了（最大的下标为数组的长度-1）
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        // 创建一个新的数组
        int[] newArr = new int[elements.length - 1];
        // 把原数组中的元素复制到新的数组中
        for (int i = 0; i < newArr.length; i++) {
            //当前遍历下标小于要删除元素的下标
            if (i < index) {
                newArr[i] = elements[i];
            }
            // 要删除的元素之后的元素
            else {
                newArr[i] = elements[i + 1];
            }
        }
        // 使用新数组替换老数组
        elements = newArr;
    }

    /**
     * 往数组中插入元素到指定位置
     *
     * @param index   插入的位置
     * @param element 插入的值
     */
    public void insert(int element, int index) {
        //如果下标<0,或者大于最大边界了（最大的下标为数组的长度-1）
        if (index < 0 || index > elements.length) {
            throw new RuntimeException("下标越界");
        }
        // 创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        // 把原数组中的元素复制到新的数组中
        for (int i = 0; i < elements.length + 1; i++) {
            // 目标位置之前的元素
            if (i < index) {
                newArr[i] = elements[i];
            }
            //目标位置的元素
            else if (i == index) {
                newArr[i] = element;
            }// 目标位置之后的元素
            else {
                newArr[i] = elements[i - 1];
            }
        }
        // 使用新数组替换老数组
        elements = newArr;
    }

    /**
     * 获取某个下标的元素
     *
     * @param index 下标数
     */
    public int get(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        } else {
            return elements[index];
        }
    }

    /**
     * 替换指定位置的元素
     *
     * @param element 替换值
     * @param index   下标数
     */
    public void setIndexElement(int index, int element) {
        // 判断下标是否合法
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }

    /**
     * 线性查找
     *
     * @param target 要查找的目标数字
     */
    public int linesrSearch(int target) {
        //遍历数组
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 显示数组的所有结点
     */
    public int showElement() {
        System.out.print("[");
        //遍历数组
        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length - 1) {
                System.out.print(elements[i]);
            } else {
                System.out.print(elements[i] + ",");
            }
        }
        System.out.println("]");
        return -1;
    }

    /**
     * 二分法查找
     *
     * @param target 要查找的目标数字
     */
    public int dichotomySearch(int target) {
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = elements.length - 1;
        //记录中间位置
        int mid = (begin + end) / 2;
        //循环查找
        while (true) {
            //如果开始和结束元素相等，且不等于目标元素,则结束循环
            if (begin == end && begin != target) {
                return -1;
            }
            //判断中间的元素是不是要查找的元素
            if (elements[mid] == target) {
                return mid;
            }
            //中间这个元素不是要查的元素
            else {
                // 判断中间这个元素是不是比目标元素大
                if (elements[mid] > target) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
                mid = (begin + end) / 2;
            }
        }
    }
}

