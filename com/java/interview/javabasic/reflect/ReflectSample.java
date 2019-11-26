package interview.javabasic.reflect;

/**
 * 这是一个
 *
 * @author kimtian
 */
public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取Robot的Class类
        Class rc = Class.forName("interview.javabasic.reflect.Robot");
        //创建一个rc的实例，由于是泛型，所以必须强转
        Robot r = (Robot) rc.newInstance();
    }
}
