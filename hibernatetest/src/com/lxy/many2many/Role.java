package com.lxy.many2many;

import java.util.HashSet;
import java.util.Set;

/**
 * 角色表
 * 
 * @author nest-go
 *
 */
public class Role {
    private int roleId;
    private String roleName;
    private String roleMemo;
    
    // 多对多，一个角色对应多个用户
    private Set<User> users = new HashSet<User>(0);
    /**
     * getter and setter
     * @return
     */
    public int getRoleId() {
        return roleId;
    }
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleMemo() {
        return roleMemo;
    }
    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo;
    }
    
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    @Override
    public String toString() {
        return "Role [roleId=" + roleId + ", roleName=" + roleName
                + ", roleMemo=" + roleMemo + "]";
    }
    
    
}
