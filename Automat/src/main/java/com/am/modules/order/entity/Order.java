package com.am.modules.order.entity;

import com.am.common.baseEntity.DataEntity;
import java.util.Date;

public class Order extends DataEntity<Order> {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.codeid
     *
     * @mbggenerated
     */
    private String codeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.time
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.count
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.pay
     *
     * @mbggenerated
     */
    private String pay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.machineID
     *
     * @mbggenerated
     */
    private String machineid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.paykind
     *
     * @mbggenerated
     */
    private Integer paykind;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.remarks
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.del
     *
     * @mbggenerated
     */
    private Integer del;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    public Order(Integer id, String codeid, Date time, String name, Integer count, String pay, String machineid, Integer paykind, Date updatetime, String remarks, Integer del) {
        this.id = id;
        this.codeid = codeid;
        this.time = time;
        this.name = name;
        this.count = count;
        this.pay = pay;
        this.machineid = machineid;
        this.paykind = paykind;
        this.updatetime = updatetime;
        this.remarks = remarks;
        this.del = del;
    }
    public Order(){}
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.ID
     *
     * @return the value of order.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.codeid
     *
     * @return the value of order.codeid
     *
     * @mbggenerated
     */
    public String getCodeid() {
        return codeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.time
     *
     * @return the value of order.time
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.name
     *
     * @return the value of order.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.count
     *
     * @return the value of order.count
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.pay
     *
     * @return the value of order.pay
     *
     * @mbggenerated
     */
    public String getPay() {
        return pay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.machineID
     *
     * @return the value of order.machineID
     *
     * @mbggenerated
     */
    public String getMachineid() {
        return machineid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.paykind
     *
     * @return the value of order.paykind
     *
     * @mbggenerated
     */
    public Integer getPaykind() {
        return paykind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.updatetime
     *
     * @return the value of order.updatetime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.remarks
     *
     * @return the value of order.remarks
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.del
     *
     * @return the value of order.del
     *
     * @mbggenerated
     */
    public Integer getDel() {
        return del;
    }

    public void setCodeid(String codeid) {
        this.codeid = codeid;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid;
    }

    public void setPaykind(Integer paykind) {
        this.paykind = paykind;
    }
}