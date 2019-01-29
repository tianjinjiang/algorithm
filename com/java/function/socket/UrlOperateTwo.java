package function.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 使用URL读取网页内容
 *
 * @author kimtian
 */
public class UrlOperateTwo {
    public static void main(String[] args) {
        try {
            //创建一个URL实例
            URL url = new URL("https://e.qq.com/ads/");
            //通过URL的openStream方法获取URL对象所表示的资源的字节输入流
            InputStream inputStream = url.openStream();
            //将字节输入流转化为字符输入流,可以指定编码
            InputStreamReader isr = new InputStreamReader(inputStream, "utf-8");
            //为字符输入流添加缓冲
            BufferedReader br = new BufferedReader(isr);
            //读取数据
            String data = br.readLine();
            while (data != null) {
                //输出数据
                System.out.println(data);
                //读取下一行数据
                data = br.readLine();
            }
            //关闭资源
            br.close();
            isr.close();
            inputStream.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
