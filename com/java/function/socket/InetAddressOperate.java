package function.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * InetAddress类的使用
 *
 * @author kimtian
 */
public class InetAddressOperate {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress实例
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("获取当前计算机的名称：" + localAddress.getHostName());
        System.out.println("获取主机的IP地址：" + localAddress.getHostAddress());
        //获取字节数组形式的IP地址
        byte[] bytes = localAddress.getAddress();
        System.out.println("字节数组形式的IP：" + Arrays.toString(bytes));
        //直接输出InetAddress对象--会输出用户名和IP地址
        System.out.println(localAddress);

        //根据主机名获取InetAddress实例
        InetAddress inetAddress = InetAddress.getByName("KIMTIAN-MC0");
        System.out.println(inetAddress);

        //根据IP地址获取相应的实例信息
        InetAddress inetAddress2 = InetAddress.getByName("10.43.19.128");
        System.out.println(inetAddress2);
    }
}
