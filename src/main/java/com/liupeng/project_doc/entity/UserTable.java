package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户表(UserTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 13:16:30
 */
@ApiModel(value = "UserTable")
public class UserTable implements Serializable {
    private static final long serialVersionUID = -28748631825734302L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称", notes = "用户名称")
    private String userName;
    /**
     * 登陆密码
     */
    @ApiModelProperty(value = "登陆密码", notes = "登陆密码")
    private String password;
    /**
     * 联系方式
     */
    @ApiModelProperty(value = "联系方式", notes = "联系方式")
    private String phonenumber;
    /**
     * 电子邮件
     */
    @ApiModelProperty(value = "电子邮件", notes = "电子邮件")
    private String email;
    /**
     * 是否注销
     */
    @ApiModelProperty(value = "是否注销", notes = "是否注销")
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}
