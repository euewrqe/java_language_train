package com.lxy.filetest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStreamTest {
    public static void main(String[] args) throws IOException {
        streamInput();
    }

    public static void streamOutput() throws IOException {
        // TODO Auto-generated method stub
        BufferedOutputStream stream = new BufferedOutputStream(
                new FileOutputStream("a.txt"));
        String s = "hello";
        stream.write(s.getBytes(), 0, s.getBytes().length);
    }
    public static void streamInput() throws IOException {
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream("a.txt"));
        byte[] b = new byte[1024];
        stream.read(b, 0, b.length);
        System.out.println(new String(b, "utf-8"));
    }
}
