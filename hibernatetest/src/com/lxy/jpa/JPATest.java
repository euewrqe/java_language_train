package com.lxy.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.lxy.first.Customer;
import com.lxy.utils.JPAUtil;


public class JPATest {
    public void test01() {
        // 创建客户对象
        JPA_Customer customer = new JPA_Customer();
        customer.setCustName("jpa customer");
        
        // 获取EntityManager对象
        EntityManager manager = JPAUtil.createEntityManager();
        
        //创建事务
        EntityTransaction ts = manager.getTransaction();
        manager.persist(customer);
        ts.commit();
        JPAUtil.close();
    }
    

    public void test02() {
        JPA_Customer customer = new JPA_Customer();
        customer.setCustName("jpa customer");
        
        // 获取EntityManager对象
        EntityManager manager = JPAUtil.createEntityManager();
        
        //创建事务
        EntityTransaction ts = manager.getTransaction();
        manager.find(Customer.class, 1L);
        // manager.getReference(arg0, arg1)  延迟加载
        ts.commit();
        JPAUtil.close();
    }
    

    public void test03() {

        // 获取EntityManager对象
        EntityManager manager = JPAUtil.createEntityManager();
        
        //创建事务
        EntityTransaction ts = manager.getTransaction();
        Customer c = (Customer)manager.find(Customer.class, 1L);
        c.setCustPhone("12546788");
        manager.merge(c);
        manager.remove(c); // delete
        ts.commit();
        JPAUtil.close();
    }
    
    public void test4() {

        // 获取EntityManager对象
        EntityManager manager = JPAUtil.createEntityManager();
        
        //创建事务
        EntityTransaction ts = manager.getTransaction();
        Query query = manager.createQuery("select * from Customer where cus lik ?");   // 支持criteria语法, JPQL
        query.getParameter(arg0)
        ts.commit();
        JPAUtil.close();
    }
}
