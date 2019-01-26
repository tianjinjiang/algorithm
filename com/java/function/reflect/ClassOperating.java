package function.reflect;

import java.lang.reflect.Method;

/**
 * Class类的基本操作
 * 通过Class类获取类的所有方法信息
 *
 * @author kimtian
 */
public class ClassOperating {
    /**
     * 打印类的信息，包括类的成员函数
     *
     * @param object 对象
     */
    public static void printClassMessage(Object object) {
        //要获取类的信息  首先要获取类的类类型
        //传递是哪个子类的类类型，c就是该子类的类类型
        Class c = object.getClass();
        //获取类的名称
        System.out.println("类的名称是" + c.getName());
        /**
         * 获取所有的方法，万事万物皆对象，方法也是对象
         * 一个成员方法就是一个Method对象
         * getMethods获取的是所有的public的函数，包括父类继承而来的
         * getDeclaredMethods获取的是所有该类自己声明的方法，不问访问权限（父类继承来的就没有了）
         */
        Method[] ms = c.getMethods();
        Method[] ms1 = c.getDeclaredMethods();
        //得到方法的名称
        for (int i = 0; i < ms.length; i++) {
            //得到方法的返回值类型 --得到的是返回值类型的类类型
            Class returnType = ms[i].getReturnType();
            //得到返回值名字
            System.out.print(returnType.getName() + " ");
            //得到方法的名称
            System.out.print(ms[i].getName() + "(");
            //获取参数的类型-->得到的是参数列表的类型的类类型
            Class[] paramTypes = ms[i].getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                //为了美观，最后一个返回值不加标点符号
                if (j == paramTypes.length - 1) {
                    System.out.print(paramTypes[j].getSimpleName());
                } else {
                    System.out.print(paramTypes[j].getSimpleName() + ",");
                }
            }
            System.out.print(")");
            System.out.println();
        }

    }



    public static void main(String[] args) {
        String s = "hello world";
        //得到String类的所有类型
        ClassOperating.printClassMessage(s);
        //得到Integer类的所有类型
        Integer i = 1;
        ClassOperating.printClassMessage(i);
    }
}
