package com.lxy.more;

import java.util.HashSet;
import java.util.Set;

/**
 * 客户表与联系人表的关系是一对多
 * 客户表, 客户有多个联系人，当查一个客户的联系人，是一个集合
 * 外键在联系人表中, 从联系人
 * @author nest-go
 *
 */
public class Customer {
    private Long custId;
    private String custName;
    private String custSource;
    private String custIndustry;
    private String custLevel;
    private String custAddress;
    private String custPhone;
    
    /**
     * 一对多
     * 从表的对象集合
     * 
     * 设置初始化开辟控件大小
     * HashSet<>(x)
     */
    private Set<LinkMan> linkmans = new HashSet<LinkMan>(0);
    
    
    /**
     * linkman getter and setter
     * @return
     */
    public Set<LinkMan> getLinkmans() {
        return linkmans;
    }
    public void setLinkmans(Set<LinkMan> linkmans) {
        this.linkmans = linkmans;
    }
    /**
     * Getter and Setter
     * @return
     */
    public Long getCustId() {
        return custId;
    }
    public void setCustId(Long custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustSource() {
        return custSource;
    }
    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }
    public String getCustIndustry() {
        return custIndustry;
    }
    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }
    public String getCustLevel() {
        return custLevel;
    }
    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }
    public String getCustAddress() {
        return custAddress;
    }
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    public String getCustPhone() {
        return custPhone;
    }
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
    
    @Override
    public String toString() {
        return "Customer [custId=" + custId + ", custName=" + custName
                + ", custSource=" + custSource + ", custIndustry="
                + custIndustry + ", custLevel=" + custLevel + ", custAddress="
                + custAddress + ", custPhone=" + custPhone + "]";
    }
    
    
}
