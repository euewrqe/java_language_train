package com.lxy.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * JPA工具类
 * @author nest-go
 *
 */
public class JPAUtil {
    // 获取EntityManager的对象
    static EntityManagerFactory factory;
    static EntityManager manager;
    static {
        factory = Persistence.createEntityManagerFactory("myJPAUnit");
    }
    
    
    /**
     * 获取EntityManager操作数据库的对象
     * 
     * @return
     */
    public static EntityManager createEntityManager() {
        manager = factory.createEntityManager();
        return manager;
    }
    
    public static void close() {
        manager.close();
        factory.close();
    }
    
    public static void main(String[] args) {
        createEntityManager();
    }
}
