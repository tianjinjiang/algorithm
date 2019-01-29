package function.reflect;

import java.lang.reflect.Field;

/**
 * Class类的基本操作
 * 通过Class类获取类的所有成员变量
 * @author kimtian
 */
public class ClassOperateTwo {
    /**
     * 打印成员变量的信息
     *
     * @param object 对象
     */
    public static void printFieldMessage(Object object) {
        Class c = object.getClass();
        /**
         * 成员变量也是对象
         * java.lang.reflect.Field中封装了关于成员变量的操作
         * getFields()方法获取的是所有的public的成员变量的信息
         * getDeclaredFields()获取的是所有该类自己声明的成员变量的信息
         */
        Field[] fs = c.getFields();
        Field[] fs1 = c.getDeclaredFields();
        for (Field field : fs1) {
            //得到成员变量的类型的类类型
            Class filedType = field.getType();
            //得到成员变量类型的名称
            String typeName = filedType.getName();
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(typeName + " " + fieldName);
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        String s = "hello world";
        //得到String类的所有局部变量以及类型
        ClassOperateTwo.printFieldMessage(s);
        //得到Integer类的所有局部变量以及类型
        Integer i = 1;
        ClassOperateTwo.printFieldMessage(i);
    }
}
