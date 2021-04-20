package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 权限表(AnthorityTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 19:23:04
 */
@ApiModel(value = "AnthorityTable")
public class AnthorityTable implements Serializable {
    private static final long serialVersionUID = 853518910467660442L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 权限
     */
    @ApiModelProperty(value = "权限", notes = "权限")
    private Integer anthority;
    /**
     * 项目ID
     */
    @ApiModelProperty(value = "项目ID", notes = "项目ID")
    private Integer projectId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnthority() {
        return anthority;
    }

    public void setAnthority(Integer anthority) {
        this.anthority = anthority;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

}
