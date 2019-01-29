package function.socket;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL类的基本操作
 *
 * @author kimtian
 */
public class UrlOperateOne {
    public static void main(String[] args) {
        try {
            //创建一个URL实例
            URL gdt = new URL("https://e.qq.com");
            //?号后面表示参数   #号后面表示锚点
            URL url = new URL(gdt, "/resources?username=kimtian#test");
            //获取相关信息====================
            System.out.println("协议信息：" + url.getProtocol());
            System.out.println("主机信息：" + url.getHost());
            //没有指定端口号，则则根据协议的不同使用默认的端口号，此时getPort()方法返回值为-1
            System.out.println("端口信息：" + url.getPort());
            System.out.println("文件路径：" + url.getPath());
            //文件路径
            System.out.println("文件名称：" + url.getFile());
            //锚点
            System.out.println("相对路径：" + url.getRef());
            //参数
            System.out.println("查询字符串：" + url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
