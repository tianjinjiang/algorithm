package function.socket.tcp;

import java.io.*;
import java.net.Socket;

/**
 * 客户端
 *
 * @author kimtian
 */
public class Client {
    /**
     * 客户端：
     * 1.创建Socket对象，指明需要连接的服务器的地址和端口号
     * 2.建立连接后，通过输出流向服务器端发送请求信息
     * 3.通过输入流获取服务器响应的信息
     * 4.关闭相关资源
     */
    public static void main(String[] args) {

        try {
            //1.创建客户端Socket，指定服务器地址和端口
            Socket socket = new Socket("127.0.0.1", 8888);
            //2.获取输出流，向服务器端发送信息
            //获取的是字节输出流
            OutputStream os = socket.getOutputStream();
            //将输出流包装成打印流
            PrintWriter pw = new PrintWriter(os);
            //要发送的信息
            pw.write("username:tom;password:123");
            //去刷新缓存，向服务器端发送信息
            pw.flush();
            //关闭当前Socket的输出流
            socket.shutdownOutput();
            //3.获取输入流，并读取服务端响应信息
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;
            //循环读取服务器端信息
            while ((info = br.readLine()) != null) {
                System.out.println("我是客户端，服务器端说：" + info);
            }
            //4.关闭相关资源
            br.close();
            is.close();
            isr.close();
            //对于同一个socket，如果关闭了输出流，则与该输出流关联的socket也会被关闭，所以一般不用关闭流，直接关闭socket即可
            //pw.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
