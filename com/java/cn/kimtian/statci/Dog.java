package cn.kimtian.statci;

/**
 * 这是一个子类
 *
 * @author kimtian
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("儿子吃了");
    }

    public static void play() {
        System.out.println("儿子在玩了");
    }

}
