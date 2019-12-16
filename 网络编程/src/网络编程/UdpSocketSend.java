package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSocketSend {
    public static void main(String[] args) throws IOException {
        // 创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket();
        // 指定数据，数据的大小，接收端的地址和端口
        String data = "hello world";
        byte[] b = data.getBytes();
        int length = b.length;
        InetAddress addr = InetAddress.getByName("localhost");
        int port = 8000;
        // 打包数据
        DatagramPacket packet = new DatagramPacket(b, length, addr, port);
        // 发送数据包
        socket.send(packet);
        // 关闭
        socket.close();
        
    }
}
