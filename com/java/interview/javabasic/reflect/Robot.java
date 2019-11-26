package interview.javabasic.reflect;

/**
 * 这是一个学习反射的类：机器人类
 *
 * @author kimtian
 */
public class Robot {
    //机器人名称
    private String name;

    /**
     * 公有的sayHi方法
     *
     * @param helloSentence 说的内容
     */
    public void sayHi(String helloSentence) {
        System.out.println(helloSentence + "" + name);
    }

    /**
     * 私有的throwHello方法
     *
     * @param tag 标签
     * @return hello+标签
     */
    private String throwHello(String tag) {
        return "Hello" + tag;
    }
}
