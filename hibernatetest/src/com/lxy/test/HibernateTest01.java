package com.lxy.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.lxy.first.Customer;

/**
 * 
 * 保存数据表到数据库
 * 1, 解析配置文件xml和映射文件xml
 * 2, 创建SessionFactory对象
 * 3, 通过SessionFactory对象创建session对象
 * 4, 开启事务
 * 5, session.save(),update()等操作
 * 6, 关闭事务和SessionFactory对象
 * @author nest-go
 *
 */
public class HibernateTest01 {
    
    @Test
    public void test01() {

        // 创建一个数据表对象
        Customer c = new Customer();
        c.setCustName("张三");
        
        Configuration cfg = new Configuration();
        cfg.configure();
        // cfg.addResource("com/lxy/first/Customer.hbm.xml");  // 映射文件可以不提前配置
        // cfg.addClass(Customer.class); // 映射名字必须和类名一致
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        // 启动事件
        Transaction ts = (Transaction) session.beginTransaction();

        // 操作并提交
        // session.save(c);
        session.createSQLQuery("SELECT * FROM customer");
        ts.commit();

        session.close();
        sessionFactory.close();

        
        

        
    }
    
    @Test
    public void test_save() {
        
    }
    
    public void test_update() {
        
    }
    
    public void find_one() {
        
    }
    public void find_all() {
        
    }
}
