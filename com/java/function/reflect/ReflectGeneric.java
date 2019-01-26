package function.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 通过Class,Method来认识泛型的本质
 *
 * @author kimtian
 */
public class ReflectGeneric {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //泛型为String的例子
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("hello");
        System.out.println("集合的前期大小为：" + stringList.size());
        //获取集合1的类类型
        Class c1 = list.getClass();
        //获取集合2的类类型
        Class c2 = stringList.getClass();
        /**
         * 反射的操作都是编译之后的操作，运行时操作
         * c1==c2 结果返回true说明编译之后集合是去泛型化的
         * Java中集合的泛型是防止错误输入的，只在编译阶段有效，绕过编辑就无效了
         * 验证：我们可以通过方法的反射来操作，绕过编译
         */
        System.out.println(c1 == c2);
        /**
         * 验证：我们可以通过方法的反射来操作，绕过编译
         */
        try {
            Method m = c2.getMethod("add", Object.class);
            //绕过编译操作就绕开了泛型
            m.invoke(stringList, 10);
            System.out.println("集合的后期大小为：" + stringList.size());
            System.out.println(stringList);
            /**
             * 不能使用for循环去遍历，因为类型不同会报错
             */
//            for (String s:stringList){
//                System.out.println(s);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
