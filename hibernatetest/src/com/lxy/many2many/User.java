package com.lxy.many2many;

import java.util.HashSet;
import java.util.Set;

/**
 * 多对多 用户表，
 * 多对多关系映射：每张表都维护一个对方的对象集合
 * @author nest-go
 *
 */
public class User {
    private long userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    
    // 多对多， 一个用户对应多个角色
    private Set<Role> roles = new HashSet<Role>(0);
    /**
     * Getter and Setter
     * @return
     */
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName
                + ", userPassword=" + userPassword + ", userEmail=" + userEmail
                + "]";
    }
    
    
}
