package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 项目表(ProjectTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 19:43:14
 */
@ApiModel(value = "ProjectTable")
public class ProjectTable implements Serializable {
    private static final long serialVersionUID = 954957646467797099L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称", notes = "项目名称")
    private String projectName;
    /**
     * 立项人
     */
    @ApiModelProperty(value = "立项人", notes = "立项人")
    private Integer userId;
    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间", notes = "开始时间")
    private String startDate;
    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间", notes = "结束时间")
    private String endDate;
    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除", notes = "是否删除")
    private Integer isDelete;
    /**
     * 项目简介
     */
    @ApiModelProperty(value = "项目简介", notes = "项目简介")
    private String projectAbstruct;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getProjectAbstruct() {
        return projectAbstruct;
    }

    public void setProjectAbstruct(String projectAbstruct) {
        this.projectAbstruct = projectAbstruct;
    }

}
