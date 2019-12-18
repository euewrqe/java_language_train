package com.lxy.test;

/**
 * HQL查询:  Hibernate query language
  使用HQL查询, HQL查询是把表名换成类名，列名变成字段名
  session.createQuery()->Query
  query.list()->List<>
 * 基本查询，排序查询，分页查询，统计查询，投影查询
 * 
 * 条件查询
 * from Customer where custLevel=? and custPhone=?
 * 第一个? 索引为0， 第二个?索引为1
 * query.setString(索引, 内容)  // set[Int,Long,...]
 * query.setParameter(, Object)
 * 内容加%模糊查询
 *
 *命名条件查询
 * from Customer where custLevel=:name1 and custPhone like :name2
 * query.setString(name, 内容)
 * @author nest-go
 *
 *排序
 *from Customer where custLevel=? and custPhone=? desc/asc
 *
 *分页：limit 2, 5
 *
 *query.setFirstResult()
 *query.setMaxResults()
 *
 *
 *count avg sum max min
 *
 *query.uniqueResult()  返回的结果要唯一
 *
 *当返回的内容是多个的时候，普通查询出来的类型是List<Object[]>， 想要是List<Customer[]>
 *
 *select xxx.xxx.xxx.Customer(custId, custName) from Customer
 */
public class HibernateQueryTest {

}
