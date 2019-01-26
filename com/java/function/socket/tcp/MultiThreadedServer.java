package function.socket.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程服务器
 *
 * @author kimtian
 */
public class MultiThreadedServer {
    /**
     * 1.服务器端创建ServerSocket，循环调用accept()等待客户端连接
     * 2.客户端创建一个socket并请求和服务器端连接
     * 3.服务器端接受客户端请求，创建socket与该客户建立专线连接
     * 4.建立连接的两个socket在一个单独的线程上对话
     * 5.服务器端继续等待新的连接
     */
    public static void main(String[] args) {
        try {
            //1.创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
            ServerSocket serverSocket = new ServerSocket(8888);
            //2.调用accept()方法开始监听，等待客户端的连接
            System.out.println("********服务器即将启动，等待客户端的连接**********");
            Socket socket = null;
            //定义一个变量记录客户端的数量
            int count = 0;
            //循环监听等待客户端监听
            while (true) {
                socket = serverSocket.accept();
                //创建一个新的线程
                ServerThread serverThread = new ServerThread(socket);
                //设置线程的优先级，范围为[1,10],默认为5
                //未设置优先级可能会导致运行时速度非常慢，可降低优先级
                serverThread.setPriority(4);
                //启动线程
                serverThread.start();
                //统计客户端的数量
                count++;
                System.out.println("客户端的数量为：" + count);
                InetAddress inetAddress = socket.getInetAddress();
                System.out.println("当前客户端的ip为："+inetAddress);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
