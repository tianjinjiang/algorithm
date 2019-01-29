package cn.kimtian.array.stack;

import java.util.Scanner;

/**
 * 栈处理
 *
 * @author kimtian
 */
public class TestStackType {
    public static void main(String[] args) {
        StackType st = new StackType();
        Data3 data = new Data3();
        StackType stack = st.stInit();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名 年龄进行入栈操作：");
        do {
            Data3 data3 = new Data3();
            data3.name = scanner.next();
            if (("0").equals(data3.name)) {
                break;
            } else {
                data.age = scanner.nextInt();
                st.stPush(stack, data3);
            }
        } while (true);
        String temp = "1";
        System.out.println("出栈操作：按任意非0键进行出栈操作：");
        temp = scanner.next();
        while (!temp.equals("0")) {
            data = st.stPop(stack);
            System.out.printf("出栈的数据是(%s,%d)\n", data.name, data.age);
            temp = scanner.next();
        }
        System.out.println("   测试结束！");
        st.stFree(st);

    }
}
