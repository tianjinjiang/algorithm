package cn.kimtian.array.stack;

import java.util.Arrays;

/**
 * 测试栈
 *
 * @author kimtian
 */
public class TestMyStack {
    public static void main(String[] args) {
        // 创建☝一个栈
        MyStack myStack = new MyStack();
        myStack.pushStack(1);
        myStack.pushStack(2);
        myStack.pushStack(3);
        myStack.pushStack(4);
        myStack.pushStack(5);
        //取出栈顶元素
        System.out.println(myStack.popStack());
        System.out.println(myStack.popStack());
        System.out.println(myStack.popStack());
        //查看栈顶元素
        System.out.println(myStack.peekStack());
        //查看栈是否为空
        System.out.println(myStack.isStackEmpty());
        System.out.println(myStack.popStack());
        System.out.println(myStack.popStack());
        //查看栈是否为空
        System.out.println(myStack.isStackEmpty());
    }
}
