package com.lxy.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.lxy.first.Customer;
import com.lxy.utils.HibernateUtils;

/**
 * QBC查询: (Query by Criteria)
  使用Criteria查询数据库
  criteria -> criterion  尺度查询
 * 获取对象: session.createCriteria(Class)->
 * 面向对象的查询方式，效率低，
 * 
 * 条件查询
 * c.add(Restrictions.eq("custLevel", "23"))加条件
 * 其他条件between, and, or, ne, lt, gt, like, ...
 * 
 * 聚合查询 projection
 * c.setProjection(Projections.count("*"))
 * avg, max,min ...
 * 
 * 离线查询
 * 
 * @author nest-go
 *
 */
public class HibernateCriteriaQueryTest {
    public void test01() {
        Session session = HibernateUtils.openSession();
        Criteria c = session.createCriteria(Customer.class);
        List<Object[]> list = c.list();
        
        c.setProjection(Projections.count("*"));
        
    }
}
