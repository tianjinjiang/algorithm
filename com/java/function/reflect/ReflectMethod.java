package function.reflect;


import java.lang.reflect.Method;

/**
 * 方法反射的基本操作
 *
 * @author kimtian
 */
public class ReflectMethod {
    public static void main(String[] args) {
        /**
         * 获取print(int,int)方法
         * 要获取一个方法就是获取类的信息，获取类的信息，首先要获取类的类类型
         */
        Ademo a1 = new Ademo();
        //获取类的类类型
        Class c = a1.getClass();
        /**
         * 获取方法 名称和参数列表决定
         * getMethod获取的是public方法
         * getDeclaredMethods获取的是自己声明的方法
         */
        try {
            //要处理异常，万一没有这样的方法会引发异常
            Method m = c.getMethod("print", new Class[]{int.class, int.class});
            //基本使用该方法的方式
            a1.print(10, 50);
            /**
             * 方法的反射操作是用m对象来进行方法调用,和上面a1.print调用的效果完全相同
             * 方法如果没有返回值返回null，有返回值返回具体的返回值
             */
            Object o = m.invoke(a1, new Object[]{15, 25});
            System.out.println("====================================");
            //也可以写成这样
            Method m1 = c.getMethod("print", String.class, String.class);
            Object o1 = m1.invoke(a1, "AAbb", "CCdd");
            System.out.println("====================================");
            /**
             * 如果没有参数，这样使用
             */
            Method m2 = c.getMethod("print", new Class[]{});
            Method m3 = c.getMethod("print");
            Object o2 = m3.invoke(a1, new Object[]{});
            Object o3 = m2.invoke(a1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Ademo {
    public void print() {
        System.out.println("nihao");
    }

    public void print(int a, int b) {
        System.out.println(a + b);
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + "," + b.toLowerCase());
    }
}
