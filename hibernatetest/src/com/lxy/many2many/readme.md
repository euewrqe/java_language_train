1, 多对多表之间插入第三张表进行关联， 多对多的两张表对于第三张表来说都是多对一
2，第三张表只有两个列，都是外键约束，主键则依赖两个外键进行关联，
3, 多对多表比如角色表和用户表，一个用户可以是多个角色，一个角色也可以分配给多个用户