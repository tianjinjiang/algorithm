package function.socket.udp;

import java.io.IOException;
import java.net.*;

/**
 * UDP客户端
 *
 * @author kimtian
 */
public class UDPClient {
    /**
     * 1.定义发送信息。
     * 2.创建DatagramPacket，包含将要发送的信息。
     * 3.创建DatagranSocket对象，实现数据对象的发送。
     * 4.发送数据。
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //1.定义服务器的地址、端口号、数据
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9999;
        byte[] bytes = "username:kimtian;password:123".getBytes();
        //2.创建数据报，包含发送的数据信息
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, port);
        //3.创建DatagramSocket对象
        DatagramSocket datagramSocket = new DatagramSocket();
        //4.向服务器端发送数据报
        datagramSocket.send(datagramPacket);
        /**
         * 接收服务器端响应信息
         */
        //1.创建数据报，用于接收服务器端响应的数据
        byte[] data = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(data, data.length);
        //2.接收服务器响应的数据
        datagramSocket.receive(datagramPacket1);
        //3.读取服务器端响应的数据信息
        String reply = new String(data, 0, datagramPacket1.getLength());
        System.out.println("我是客户端，服务器说:" + reply);
        //4.关闭资源
        datagramSocket.close();
    }
}
