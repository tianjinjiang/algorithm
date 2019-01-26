package cn.leetcode.easy;
/**
 * 中文：
 * 设计一个支持push，pop，top和在恒定时间内检索最小元素的堆栈。
 * push（x） - 将元素x推入堆栈。
 * pop（） - 删除堆栈顶部的元素。
 * top（） - 获取顶部元素。
 * getMin（） - 检索堆栈中的最小元素。
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
/**
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 Example:
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> Returns -3.
 minStack.pop();
 minStack.top();      --> Returns 0.
 minStack.getMin();   --> Returns -2.
 */

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 * @author kimtian
 */
public class MinStack {
    /**
     * 初识化栈想象成一个数组，入栈往数组尾巴加，出栈也从数组尾巴取
     */
    int[] stack;

    /** initialize your data structure here. */
    /**
     * 构造方法初识化栈
     */
    public MinStack() {
        stack = new int[0];
    }

    /**
     * 入栈操作
     * @param x 入栈的值
     */
    public void push(int x) {
        //新建一个数组，比原数组长度多1
        int[] newStack = new int[stack.length + 1];
        //将原有数组的值，放入新的数组中
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        //新数组的最后一位为新入栈的数据
        newStack[stack.length] = x;
        //将新数组赋值给原数组
        stack = newStack;
    }
    /**
     * 出栈操作，因为栈是先进后出，将数组的最后一位元素从数组中移除
     * @param
     */
    public void pop() {
        //如果栈中还有值，再进行出栈操作，防止空指针异常
        if (stack.length >= 1) {
            //新数组为原数组长度减1
            int[] newStack = new int[stack.length - 1];
            //将原数组除了最后一位的值放入新数组中
            for (int i = 0; i < newStack.length; i++) {
                newStack[i] = stack[i];
            }
            //将新数组赋值给老数组
            stack = newStack;
        }
    }

    /**
     * 取出栈顶元素
     * 因为栈是先进后出，栈顶元素就为数组的最后一位元素
     * @return 栈顶元素
     */
    public int top() {
        return stack[stack.length - 1];
    }

    /**
     * 栈中最小的值
     * @return 栈中最小的数值
     */
    public int getMin() {
        int min = Integer.MAX_VALUE;
        //循环栈中的值，如果小于最小值，则替换最小值
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] < min) {
                min = stack[i];
            }
        }
        //返回最小值
        return min;
    }
}
