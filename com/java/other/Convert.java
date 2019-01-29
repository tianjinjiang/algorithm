package other;

/**
 * 基本类型和字节数组的转换
 *
 * @author kimtian
 */
public class Convert {
    /**
     * int 转换为字节数组
     *
     * @param id 要转化的int id
     * @return byte[]字节数组
     */
    public static byte[] intToBytes(int id) {
        byte[] arr = new byte[4];
        arr[0] = (byte) ((int) ((id >> 0 * 8) & 0xff));
        arr[1] = (byte) ((int) ((id >> 1 * 8) & 0xff));
        arr[2] = (byte) ((int) ((id >> 2 * 8) & 0xff));
        arr[3] = (byte) ((int) ((id >> 3 * 8) & 0xff));
        return arr;
    }

    /**
     * int 转换为字节数组--优化
     *
     * @param id 要转化的int id
     * @return byte[]字节数组
     */
    public static byte[] intToBytes1(int id) {
        byte[] arr = new byte[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) ((int) ((id >> i * 8) & 0xff));
        }
        return arr;
    }

    /**
     * long 转换为字节数组
     *
     * @param id 要转化的int id
     * @return byte[]字节数组
     */
    public static byte[] longToBytes(long id) {
        byte[] arr = new byte[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) ((long) ((id >> i * 8) & 0xff));
        }
        return arr;
    }

    /**
     * 转换字节数组为int型
     *
     * @param arr 要转化的字节数组
     * @return 返回的int型
     */
    public static int bytesToInt(byte[] arr) {
        int i1 = (int) ((arr[0] & 0xff) << 0 * 8);
        int i2 = (int) ((arr[1] & 0xff) << 1 * 8);
        int i3 = (int) ((arr[2] & 0xff) << 2 * 8);
        int i4 = (int) ((arr[3] & 0xff) << 3 * 8);
        return i1 + i2 + i3 + i4;
    }

    /**
     * 转换字节数组为int型--优化
     *
     * @param arr 要转化的字节数组
     * @return 返回的int型
     */
    public static int bytesToInt1(byte[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (int) ((arr[i] & 0xff) << i * 8);
        }
        return result;
    }


    public static void main(String[] args) {
        byte[] arr1 = intToBytes1(8143);
        for (byte cc : arr1) {
            System.out.print(cc + ",");
        }
        System.out.println();
        byte[] arr2 = longToBytes(814332254);
        for (byte cc : arr2) {
            System.out.print(cc + ",");
        }
        System.out.println();
        System.out.println("字节数组转化为int： " + bytesToInt1(arr1));


        //字符串转化为字节数组
        String s1 = "我每天都学习，我真勤奋";
        byte[] bs = s1.getBytes();
        System.out.println(bs.length);
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }
        //字节数组转成字符串
        String s2 = new String(bs);
        System.out.println(s2);

    }
}
