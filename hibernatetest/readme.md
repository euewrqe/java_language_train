hibernate环境需要的包:
required\*

c3p0配置: 
option\c3p0\*

test:
junit-4.12.jar
hamcrest-2.1.jar

mysql:
mysql-connector



hibernate dtd配置:
project\hibernate-core\src\main\resources\org\hibernate\:

hibernate-configuration: hibernate.cfg.xml
hibernate-mapping: xxx.hbm.xml

hbconfig中的一些配置信息: 
project\etc\hibernate.properties

c3p0配置关键字: connection provider

get和Load的用法，
session.get(class, id);
session.load(class, id);
区别:
get是实时加载，每次调用get方法时就加载， 返回的是实体类类型
load是懒加载，真正使用时发起查询，返回的是实体类的代理类

javabean是java语言编写的可重用组件，domain, service, dao都可以看成javaBean规范

编写规范: 
   类都是public的
  一般实现序列化接口Serializer
  类成员都是私有的
私有类成员都有共有的get/set方法
类都有默认无参构造函数

基本类型和包装类：都用包装类


hibernate对象标识符，OID
hibernate中对象标识符一样的对象都是同一个对象，不允许两个对象标识符一样的对象出现
就是mapping中的id
用hibernate的主键生成策略就可以让hibernate管理对象的对象标识符

主键生成策略
native代理主键，identiy,sequence, hilo

================
uuid代理主键
increment只有在没有其他进程向同一张表中插入数据时才可以使用

代理主键和自然主键

代理主键不参与业务逻辑，只是对不同记录的区分
自然主键参与业务逻辑，例如订单id，

一级缓存和快照，查一遍存两份

对象的状态: 瞬时状态，持久化状态，托管状态


持久化状态: session无效，

事务: 一个线程只能一个session

openSession, 
getCurrentSession: session already close， 
hibernate

no currentSessionContext configured  没有已经配置的当前线程上下文


===========================
### 查询
OID查询: get和load
SQL查询: 
  两种方式:  
    第一种: SQLQuery
    第二种: session的doWork

HQL查询:  Hibernate query language
  使用HQL查询, HQL查询是把表名换成类名，列名变成字段名

session.createQuery(HQL)


对象导航查询:
 
 
 
 
