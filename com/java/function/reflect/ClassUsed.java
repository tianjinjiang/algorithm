package function.reflect;

/**
 * Class类的使用
 *
 * @author kimtian
 */
public class ClassUsed {
    public static void main(String[] args) {
        //Student 对象的实例
        Student student1 = new Student();
        //Student这个类也是一个实例对象，是Class类的实例对象
        //任意一个类都是Class的实例对象，这个实例对象有三种表示方式

        //第一种表示方式-->任何一个类都有一个隐含的静态成员变量class
        Class c1 = Student.class;
        System.out.println(c1);

        //第二种表达方式  已经知道该类的对象，通过getClass方法调用
        Class c2 = student1.getClass();
        //第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("function.reflect.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2 == c3);
        /**
         * c1,c2表示了Student类的类类型（ClassType）
         * 万事万物皆对象
         * 类也是对象，是Class类的实例对象
         * 这个对象我们称为该类的类类型
         */
        // 不管c1 or c2 都代表了foo类的类类型,一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2);

        //我们完全可以通过类的类类型创建该类的实例对象。-->通过c1 or c2 or c3创建Student的实例
        Student student2 = null;
        try {
            //需要有无参数的构造方法,否则会报错
            student2 = (Student) c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Student {
}