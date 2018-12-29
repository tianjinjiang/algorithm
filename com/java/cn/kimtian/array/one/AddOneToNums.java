package cn.kimtian.array.one;

/**
 * 求从1加到指定数字的和
 * @author kimtian
 **/
public class AddOneToNums {
    public static void main(String[] args) {
        long total = 0;
        long end = 999999999;
        Long a = System.currentTimeMillis();
        /**
         * 第一种方式：循环从1加到100
         **/
        for (long i = 1; i <= end; i++) {
            total += i;
        }
        Long b = System.currentTimeMillis();
        System.out.println("第一种方式结果："+total+"，耗时："+(b-a));
        /**
         * 第二种方式：循环从1加到100
         **/
        long total2 = 0;
        Long c = System.currentTimeMillis();
        total2 = (end + 1) / 2 * end;
        Long d = System.currentTimeMillis();
        System.out.println("第二种方式结果："+total2+"，耗时："+(d-c));
    }
}
