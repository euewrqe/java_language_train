package com.lxy.filetest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.List;

public class FileStreamTest {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
    }
    
    /**
     * 字节输出流的操作
     * @throws UnsupportedEncodingException
     * @throws IOException
     */
    public static void saveStreamFile()  throws UnsupportedEncodingException, IOException {
        FileOutputStream stream = new FileOutputStream("a.txt");
        String s = "abcd你好";
        System.out.println(s.length());
        stream.write(s.getBytes("utf-8"), 0, s.getBytes("utf-8").length);
        stream.close();
    }
    /**
     * 字节输入流的操作
     * @throws IOException
     */
    public static void readStreamFile() throws IOException {
        FileInputStream stream = new FileInputStream("a.txt");
        byte[] b = new byte[1024];
        int result = stream.read(b, 0, b.length);
        System.out.println(new String(b, "utf-8"));
        System.out.println(result);
        stream.close();
    }
    
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("a.txt");
        char[] c = new char[1024];
        int result = fr.read(c, 0, c.length);
        System.out.println(new String(c));
        System.out.println(result);
        fr.close();
    }
    
    public static void writeFile() throws IOException {
        FileWriter fw = new FileWriter("a.txt");
        String s = "google玩具";
        fw.write(s);
        System.out.println("OK");
        fw.close();
    }
    
    /**
     * 文件操作
     */
    public static void FileAction() throws Exception {
        
        
    }
}
