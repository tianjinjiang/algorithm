package function.reflect;

/**
 * 如果需要加其他OfficeAble的具体实现，也不需要重新修改编译这个类
 *
 * @author kimtian
 */
public class OffiiceBetter {
    public static void main(String[] args) {
        try {
            //动态加载类，在运行时刻加载
            Class c = Class.forName(args[0]);

            //通过类类型，创建该类对象
            OfficeAble oa = (OfficeAble) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
