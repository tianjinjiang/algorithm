package function.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP服务器端，实现基于UDP的用户登录
 *
 * @author kimtian
 */
public class UDPServer {
    /**
     * 服务器端实现方式：
     * 1.创建DatagranSocket，指定端口号。
     * 2.创建DatagramPacket。
     * 3.接收客户端发送的数据信息。
     * 4.读取数据。
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            //1.创建服务器端DatagranSocket，指定端口号。
            DatagramSocket datagramSocket = new DatagramSocket(9999);
            //2.创建数据报，用于接收客户端发送的数据
            //创建字节数组，指定接收的数据包的大小
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            //3.接收客户端发送的数据
            //在阻塞之前进行提示，服务器端已经启动
            System.out.println("******UDP服务器端已经启动，等待客户端发送数据******");
            //此方法在接收到数据报之前一直处于阻塞状态，等待接收客户端发送的数据
            datagramSocket.receive(datagramPacket);
            //4.读取数据
            //长度为接收到的长度datagramPacket.getLength()
            String info = new String(bytes, 0, datagramPacket.getLength());
            System.out.println("我是服务器，客户端说" + info);

            /**
             * 向客户端响应数据
             */
            //1.定义客户端的地址、端口号、数据
            InetAddress address = datagramPacket.getAddress();
            int port = datagramPacket.getPort();
            byte[] data = "欢迎您，客户端".getBytes();
            //2.创建数据报，包含响应的数据信息
            DatagramPacket datagramPacket1 = new DatagramPacket(data, data.length, address, port);
            //3.响应客户端
            datagramSocket.send(datagramPacket1);
            //4.关闭资源
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
