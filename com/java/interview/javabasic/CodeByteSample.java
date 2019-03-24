package interview.javabasic;

/**
 * java特性之Compile Once，Run Anyway
 *
 * @author kimtian
 */
public class CodeByteSample {
    public static void main(String[] args) {
        int i = 5, j = 5;
        i++;
        ++j;
        System.out.println(i);
        System.out.println(j);
    }
}
