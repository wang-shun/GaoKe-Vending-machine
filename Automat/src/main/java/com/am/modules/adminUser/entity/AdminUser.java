package com.am.modules.adminUser.entity;


import com.am.common.baseEntity.DataEntity;

public class AdminUser extends DataEntity<AdminUser>{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.ID
     *
     * @mbggenerated
     */
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCodeid(String codeid) {
        this.codeid = codeid;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.admin_name
     *
     * @mbggenerated
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.codeid
     *
     * @mbggenerated
     */
    private String codeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.permission
     *
     * @mbggenerated
     */
    private Integer permission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_user.del
     *
     * @mbggenerated
     */
    private Integer del;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated
     */
    public AdminUser(Integer id, String adminName, String password, String codeid, Integer permission, Integer del) {
        this.id = id;
        this.adminName = adminName;
        this.password = password;
        this.codeid = codeid;
        this.permission = permission;
        this.del = del;
    }
    public AdminUser(){}
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.ID
     *
     * @return the value of admin_user.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.admin_name
     *
     * @return the value of admin_user.admin_name
     *
     * @mbggenerated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.password
     *
     * @return the value of admin_user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.codeid
     *
     * @return the value of admin_user.codeid
     *
     * @mbggenerated
     */
    public String getCodeid() {
        return codeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.permission
     *
     * @return the value of admin_user.permission
     *
     * @mbggenerated
     */
    public Integer getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_user.del
     *
     * @return the value of admin_user.del
     *
     * @mbggenerated
     */
    public Integer getDel() {
        return del;
    }
}