package function.reflect;

/**
 * 基本的类类型，void关键字，都存在类类型
 */
public class ClassDemo {
    public static void main(String[] args) {
        //int的类类型
        Class c1 = int.class;
        //String的类类型
        Class c2 = String.class;
        //double数据类型的类类型
        Class c3 = double.class;
        //Double类型的类类型，和上面的不一样
        Class c4 = Double.class;
        Class c5 = void.class;
        Class c6 = Package.class;
        //基本数据类型，只返回一个int
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        //其他数据类型会返回带着包名的全称
        System.out.println(c4.getName());
        //不含包名的类的名称
        System.out.println(c4.getSimpleName());
        System.out.println(c5.getName());
        System.out.println(c6.getName());
    }
}
