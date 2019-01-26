package function.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 基于TCP协议的Socket通信，实现用户登录
 * 服务器端
 *
 * @author kimtian
 */
public class Server {
    /**
     * 服务器端实现步骤：
     * 1.创建ServerSocket对象，绑定监听端口
     * 2.通过accept()方法监听客户端请求
     * 3.建立连接后，通过输入流读取客户端发送的请求信息
     * 4.通过输出流向客户端发送响应信息
     * 5.关闭相关资源
     */
    public static void main(String[] args) {
        try {
            //1.创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
            ServerSocket serverSocket = new ServerSocket(8888);
            //2.调用accept()方法开始监听，等待客户端的连接
            System.out.println("********服务器即将启动，等待客户端的连接**********");
            //一旦调用后处于阻塞情况，等待客户端监听
            Socket socket = serverSocket.accept();
            //3.获取输入流，并读取客户端信息
            //字节输入流
            InputStream is = socket.getInputStream();
            //将字节流转化为字符流
            InputStreamReader isr = new InputStreamReader(is);
            //为输入流添加缓冲
            BufferedReader br = new BufferedReader(isr);
            String info = null;
            //循环读取客户端信息
            while ((info = br.readLine()) != null) {
                System.out.println("我是服务器，客户端说：" + info);
            }

            //关闭输入流
            socket.shutdownInput();
            //4.获取输出流，响应客户端的请求
            OutputStream os = socket.getOutputStream();
            //将输出流包装成打印流
            PrintWriter pw = new PrintWriter(os);
            //要发送的信息
            pw.write("欢迎您！我已经接受到了你的请求了。");
            //调用flush()方法将缓存输出
            pw.flush();
            //关闭当前Socket的输出流
            socket.shutdownOutput();
            //5.关闭相关资源
            pw.close();
            os.close();
            br.close();
            is.close();
            isr.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
