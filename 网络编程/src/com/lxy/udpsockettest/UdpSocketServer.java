package com.lxy.udpsockettest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpSocketServer {
    
    /**
     * 服务端接收数据
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        System.out.println("服务器");
        // 创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket(8000, InetAddress.getByName("localhost"));
        
        //创建包
        byte[] b = new byte[1024];
        DatagramPacket packet = new DatagramPacket(b, b.length);
        while(true) {
          //循环接收
            // 接收包
            socket.receive(packet);
            //解析包，如果遇到时886，就结束
            String data = new String(packet.getData(), 0, packet.getLength());
            System.out.println(data);
            if(data.trim().equals("886")) {
                break;
            }
        }
        
        //关闭
        System.out.println("关闭流");
        socket.close();
    }
}
