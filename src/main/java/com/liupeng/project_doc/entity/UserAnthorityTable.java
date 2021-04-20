package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户权限表(UserAnthorityTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 19:41:20
 */
@ApiModel(value = "UserAnthorityTable")
public class UserAnthorityTable implements Serializable {
    private static final long serialVersionUID = -71230537150202468L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID", notes = "用户ID")
    private Integer userId;
    /**
     * 权限ID
     */
    @ApiModelProperty(value = "权限ID", notes = "权限ID")
    private Integer userAnthority;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserAnthority() {
        return userAnthority;
    }

    public void setUserAnthority(Integer userAnthority) {
        this.userAnthority = userAnthority;
    }

}
