package function.reflect;

import java.lang.reflect.Modifier;

/**
 * Class类的基本操作
 * 通过Class类获取类的其他信息
 *
 * @author kimtian
 */
public class ClassOperateFour {
    /**
     * 打印构造函数的信息
     *
     * @param object 对象
     */
    public static void printOtherMessage(Object object) {
        //获取类类型
        Class c = object.getClass();
        /**
         * 得到类实现的接口
         */
        Class[] interfaces = c.getInterfaces();
        for (Class class1 : interfaces) {
            System.out.println(class1.getName());
        }
        /**
         * 得到类的访问权限,返回的是一个int类型
         */
        int a = c.getModifiers();
        /**
         * 由于int类型我们还是不好确认访问权限是什么，所以使用Modifier.toString将其转换
         */
        String string = Modifier.toString(a);
        System.out.println(string);
        /**
         * 得到包名称
         */
        Package pk = c.getPackage();
        System.out.println(pk);
        /**
         * 得到父类
         */
        Class class2 = c.getSuperclass();
        System.out.println(class2);
        /**
         * 还有很多信息可以获取，可自行查看源码和文档
         */

    }

    public static void main(String[] args) {
        printOtherMessage("hello");
        printOtherMessage(new Integer("1"));
    }

}
