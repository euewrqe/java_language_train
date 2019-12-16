package com.lxy.filetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * 对象序列化流
 * 
 * @author nest-go
 *
 */
public class ObjectStreamTest {
    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        objectDeSerialize();
    }

    public static void objectSerialize()
            throws FileNotFoundException, IOException {
        ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("a"));
        Student s = new Student("张三", 20);
        stream.writeObject(s);

    }

    public static void objectDeSerialize()
            throws ClassNotFoundException, IOException {
        ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("a"));
        Student s = (Student) stream.readObject();
        System.out.println(s.getName());
    }

}
