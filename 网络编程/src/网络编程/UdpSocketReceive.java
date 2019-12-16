package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSocketReceive {
    public static void main(String[] args) throws IOException {
        InetAddress addr = InetAddress.getByName("localhost");
        int port = 8000;
        //创建一个DatagramSocket对象，传入地址
        DatagramSocket socket = new DatagramSocket(port, addr);
        // 创建数据包用来接收数据
        byte[] b = new byte[1024];
        DatagramPacket packet = new DatagramPacket(b, 0, b.length);
        // 接收数据
        socket.receive(packet);
        
        //解析数据
        byte[] new_b = packet.getData();
        System.out.println(new String(new_b));
        // 关闭
        socket.close();
    }
}
