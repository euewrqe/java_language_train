package com.lxy.propertiesTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.setProperty("log.level", "debug");
        prop.setProperty("log.name", "olt");
        String level = prop.getProperty("log.level");
        System.out.println(level);
        
        Set<String> sp = prop.stringPropertyNames();  //获取所有属性名字
        for(Iterator<String>iterator=sp.iterator(); iterator.hasNext();) {
            String key = iterator.next();
            System.out.println(key + "," + prop.getProperty(key));
        }
        FileWriter out = new FileWriter("log.properties");
        prop.store(out, "abcd");
        out.close();

        
        
    }
}
