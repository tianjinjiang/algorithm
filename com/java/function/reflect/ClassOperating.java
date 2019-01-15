package function.reflect;

import java.lang.reflect.Method;

/**
 * Class类的基本操作
 * @author kimtian
 */
public class ClassOperating {
    /**
     * 打印累的信息，包括类的成员函数和成员变量
     * @param object 该对象所属类的信息
     */
    public static void printClassMessage(Object object){
        //要获取类的信息  首先要获取类的类类型
        //传递是哪个子类的类类型，c就是该子类的类类型
        Class c = object.getClass();
        //获取类的名称
        System.out.println("类的名称是"+c.getName());
        /**
         * 获取所有的方法，万事万物皆对象，方法也是对象,方法是Method对象
         * getMethods获取的是所有的public的函数，包括父类继承而来的
         */
        Method[] ms = c.getMethods();

    }
}
