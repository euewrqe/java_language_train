package com.lxy.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.junit.Test;

import com.lxy.first.Customer;
import com.lxy.utils.HibernateUtils;

/**
 * hibernate增删改查操作
 * @author nest-go
 *
 */
public class HibernateCurlTest {
    //@Test
    public void test_save() {
        Customer c = new Customer();   // 临时状态
        c.setCustName("王芳");
        c.setCustPhone("123222");
        
        Session session = HibernateUtils.openSession();
        Transaction ts = session.beginTransaction();
        session.save(c);              // 持久态
        ts.commit();
        session.close();
        
    }
    
    // @Test
    public void test_get() {
        Session session = HibernateUtils.openSession();
        Transaction ts = session.beginTransaction();
        Customer c = session.get(Customer.class, 1L);
        System.out.println(c.getCustName());
        session.close();
    }
    
    @Test
    public void test_update() {
        Session session = HibernateUtils.openSession();
        Customer c = session.get(Customer.class, 3L);    // 托管状态
        c.setCustPhone("1354444");
        
        Transaction ts = session.beginTransaction();
        session.update(c);
        
        ts.commit();
        session.close();
    }
    
    // @Test
    public void test_delete() {
        Session session = HibernateUtils.openSession();
        Customer c = session.get(Customer.class, 2L);
        
        Transaction ts = session.beginTransaction();
//        session.saveOrUpdate(object);

        session.delete(c);
        ts.commit();
        session.close();
        
        // Session/EntityManager is closed
    }
    
    // @Test
    public void test_findall() {
        Session session = HibernateUtils.openSession();
        Transaction ts = session.beginTransaction();
        NativeQuery result = session.createSQLQuery("SELECT * FROM customer");
        List<Object[]> list = result.list();
        for(Object[] obj_arr : list) {
            for(Object obj : obj_arr) { 
                System.out.println(obj);
            }
        }
        
    }
    
    
}
