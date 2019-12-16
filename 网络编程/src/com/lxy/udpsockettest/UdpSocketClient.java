package com.lxy.udpsockettest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSocketClient {
    /**
     * 客户端发送数据
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 定义一个DatagramSocket对象
        System.out.println("客户端");
        DatagramSocket socket = new DatagramSocket();

        // 传入数据
        Outer:while (true) {
            BufferedReader stream = new BufferedReader(
                    new InputStreamReader(System.in));
            String line;
            // 数据打包
            line = stream.readLine();
            byte[] b = line.getBytes();
            DatagramPacket packet = new DatagramPacket(b, line.length(),
                    InetAddress.getByName("localhost"), 8000);
            System.out.println(line.trim());
            //发送数据包
            socket.send(packet);
            
            if(line.trim().equals("886")) {
                break;
            }
            
        }
        // 关闭
        System.out.println("结束发送");
        socket.close();

    }
}
