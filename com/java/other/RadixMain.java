package other;

/**
 * JDK内置的进制转换
 *
 * @author kimtian
 */
public class RadixMain {
    public static void main(String[] args) {
        //十进制转化为其他进制
        //十进制转化为十六进制
        System.out.println(Integer.toHexString(21));
        //十进制转化为十进制
        System.out.println(Integer.toOctalString(21));
        //十进制转化为二进制
        System.out.println(Integer.toBinaryString(21));
        //其他进制转化为十进制
        //十六进制转化为十进制
        System.out.println(Integer.valueOf("FFFF", 16).toString());
        //八进制转化为十进制
        System.out.println(Integer.valueOf("376", 8).toString());
        //二进制转化为十进制
        System.out.println(Integer.valueOf("10101", 2).toString());
    }
}
