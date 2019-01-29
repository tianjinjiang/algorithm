package function.reflect;

import java.lang.reflect.Constructor;

/**
 * Class类的基本操作
 * 通过Class类获取类的构造函数的信息
 *
 * @author kimtian
 */
public class ClassOperateThree {
    /**
     * 打印构造函数的信息
     *
     * @param object 对象
     */
    public static void printContructMessage(Object object) {
        //获取类类型
        Class c = object.getClass();
        /**
         * 构造函数也是对象
         * java.lang.reflect.Constructor中封装了构造函数的信息
         * Field类封装了关于成员变量的操作
         * getConstructors()方法获取的是所有的public的构造函数的信息
         * getDeclaredConstructors()获取的是所有的构造函数的信息，构造方法必须是自己声明的
         */
        Constructor[] cs = c.getConstructors();
        Constructor[] cs1 = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
            //得到构造方法的名称
            System.out.print(constructor.getName() + "(");
            //获取构造函数的参数列表-->得到的是参数列表的类类型
            Class[] paramTypes = constructor.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                //为了美观，最后一个返回值不加标点符号
                if (j == paramTypes.length - 1) {
                    System.out.print(paramTypes[j].getName());
                } else {
                    System.out.print(paramTypes[j].getName() + ",");
                }
            }
            System.out.println(")");

        }
    }

    public static void main(String[] args) {
        printContructMessage("hello");
        printContructMessage(new Integer("1"));
    }
}
