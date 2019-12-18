package com.lxy.more;

/**
 * 联系人表，从表，多对一
 * 
 * @author nest-go
 *
 */
public class LinkMan {
    
    private int lkmId;
    private String lkmName;
    private String lkmGender;
    private String lkmPhone;
    private String lkmMobile;
    private String lkmEmail;
    private String lkmPosition;
    private String lkmMemo;
    
    // 在从表中设置主表的对象
    private Customer customer;

    
    /**
     * getter and setter
     * @return
     */
    public int getLkmId() {
        return lkmId;
    }

    public void setLkmId(int lkmId) {
        this.lkmId = lkmId;
    }

    public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    public String getLkmGender() {
        return lkmGender;
    }

    public void setLkmGender(String lkmGender) {
        this.lkmGender = lkmGender;
    }

    public String getLkmPhone() {
        return lkmPhone;
    }

    public void setLkmPhone(String lkmPhone) {
        this.lkmPhone = lkmPhone;
    }

    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    public String getLkmEmail() {
        return lkmEmail;
    }

    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }

    public String getLkmPosition() {
        return lkmPosition;
    }

    public void setLkmPosition(String lkmPosition) {
        this.lkmPosition = lkmPosition;
    }

    public String getLkmMemo() {
        return lkmMemo;
    }

    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "LinkMan [lkmId=" + lkmId + ", lkmName=" + lkmName
                + ", lkmGender=" + lkmGender + ", lkmPhone=" + lkmPhone
                + ", lkmMobile=" + lkmMobile + ", lkmEmail=" + lkmEmail
                + ", lkmPosition=" + lkmPosition + ", lkmmemo=" + lkmMemo + "]";
    }
    
    
    
}
