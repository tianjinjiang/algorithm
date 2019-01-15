package function.reflect;

/**
 * 如果有一个出问题，全部其他的功能也都使用不了
 * 每次增加新功能，要修改基础代码
 *
 * @author kimtian
 */
public class Office {
    public static void main(String[] args) {
        if ("Word".equals(args[0])) {
            //new创建对象是静态加载类，在编译时刻就需要加载所有可能使用到的类。
            //只想在运行哪个时候加载哪个，就要使用动态加载类
            Word word = new Word();
            word.start();
        }
        if ("Excel".equals(args[0])) {
//            Excel excel = new Excel();
//            excel.start();
        }
    }
}
