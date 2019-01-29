package cn.kimtian.array.stack;

/**
 * 栈的类
 *
 * @author kimtian
 */
public class StackType {
    /**
     * 栈的最大容量
     */
    static final int MAXLEN = 50;

    /**
     * 数据元素
     */
    Data3[] data3s = new Data3[MAXLEN + 1];
    /**
     * 栈顶
     */
    int top;

    /**
     * 初始化栈
     *
     * @return 栈
     */
    StackType stInit() {
        StackType p;
        if ((p = new StackType()) != null) {
            p.top = 0;
            return p;
        }
        return null;
    }

    /**
     * 判断空栈
     *
     * @param s 栈
     * @return
     */
    boolean stEmpty(StackType s) {
        boolean t;
        t = (s.top == 0);
        return t;
    }

    /**
     * 判断满栈
     *
     * @param s 栈
     * @return
     */
    boolean stFull(StackType s) {
        boolean t;
        t = (s.top == MAXLEN);
        return t;
    }

    /**
     * 清空栈
     *
     * @param s 栈
     * @return
     */
    void stClean(StackType s) {
        s.top = 0;
    }

    /**
     * 释放栈所占用的内存空间
     *
     * @param s 栈
     * @return
     */
    void stFree(StackType s) {
        if (s != null) {
            //直接赋值null操作释放所分配的内存
            s = null;
        }
    }

    /**
     * 入栈
     *
     * @param s     栈
     * @param data3 入栈数据
     * @return
     */
    int stPush(StackType s, Data3 data3) {
        if ((s.top + 1) > MAXLEN) {
            System.out.println("栈溢出。");
            //入栈失败
            return 0;
        }
        //将元素入栈
        s.data3s[++s.top] = data3;
        //入栈成功
        return 1;
    }

    /**
     * 出栈操作
     *
     * @param s 栈
     * @return
     */
    Data3 stPop(StackType s) {
        if (s.top == 0) {
            System.out.println("栈是空栈。");
            //太暴力了，结束正在运行的虚拟机，直接回到最上层，不建议使用
            System.exit(0);
        }
        return (s.data3s[s.top - 1]);
    }

    /**
     * 读栈顶元素
     *
     * @param s 栈
     * @return
     */
    Data3 stPeek(StackType s) {
        if (s.top == 0) {
            System.out.println("栈为空！");
            ////太暴力了，结束正在运行的虚拟机，直接回到最上层，不建议使用
            System.exit(0);
        }
        return (s.data3s[s.top]);
    }
}
