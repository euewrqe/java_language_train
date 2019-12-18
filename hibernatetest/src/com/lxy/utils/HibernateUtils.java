package com.lxy.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * hibernate共同的定义
 * @author nest-go
 *
 */
public class HibernateUtils {
    private static Configuration cfg;
    private static SessionFactory sessionFactory;
    private static Session session;
    static {
        
        cfg = new Configuration();
        cfg.configure();
        sessionFactory = cfg.buildSessionFactory();
        
    }
    
    /**
     * 创建一个session
     * @return
     */
    public static Session openSession() {
        session = sessionFactory.openSession();
        return session;
    }
    
    /**
     * 获取当前session ?
     * @return
     */
    public static Session getCurrentSession() {
        session = sessionFactory.getCurrentSession();
        return session;
    }
    
    public static void close() {
        session.close();  // 关闭session
        sessionFactory.close();
    }
    
    
}
