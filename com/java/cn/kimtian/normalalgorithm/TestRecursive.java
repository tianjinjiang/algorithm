package cn.kimtian.normalalgorithm;

/**
 * 递归
 *
 * @author kimtian
 */
public class TestRecursive {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int i) {
        //当大于0的时候，进行打印，作为终止条件。
        if (i > 0) {
            System.out.println(i);
            print(i - 1);
        }
    }
}
