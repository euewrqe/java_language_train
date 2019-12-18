package com.lxy.jpa;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * 客户的实体类
 * @author nest-go
 *
 */
@Entity  // 表明是一个实体类
@Table(name = "jpa_customer")   // 类和表的对应关系
public class JPA_Customer implements Serializable {
    
    @Id  // 表明是一个主键
    @Column(name="cust_id")  // 表示数据库字段是cust_id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 主键生成策略
    private Long custId;
    
    @Column(name="cust_name")
    private String custName;
    
    @Column(name="cust_source")
    private String custSource;
    
    @Column(name="cust_industry")
    private String custIndustry;
    
    @Column(name="cust_level")
    private String custLevel;
    
    @Column(name="cust_address")
    private String custAddress;
    
    @Column(name="cust_phone")
    private String custPhone;
    
    /**
     * 关联对方的类
     * @ManyToOne(targetEntity = JPA_Customer.class,cascade = CascadeType.MERGE)
     * @OneToMany(targetEntity = JPA_Customer.class,mappedBy = "customer")
     * @JoinColumn(name="lkm_cust_id",  referencedColumnName="cust_id")
     * onetomany: mappedBy相当于hibernate的inverse
     * 
     * CascadeType.ALL  级联操作
     * CascadeType.MERGE
     * CascadeType.REMOVE
     * 
     * 
     */

    /**
     * setter and getter
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
    
    
}
