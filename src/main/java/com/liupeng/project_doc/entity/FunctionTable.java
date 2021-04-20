package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 函数表(FunctionTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 20:37:32
 */
@ApiModel(value = "FunctionTable")
public class FunctionTable implements Serializable {
    private static final long serialVersionUID = -98974920187608346L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 所属项目ID
     */
    @ApiModelProperty(value = "所属项目ID", notes = "所属项目ID")
    private Integer projectId;
    /**
     * 函数ID
     */
    @ApiModelProperty(value = "函数ID", notes = "函数ID")
    private Integer functionId;
    /**
     * 函数名称
     */
    @ApiModelProperty(value = "函数名称", notes = "函数名称")
    private String functionname;
    /**
     * 函数路径
     */
    @ApiModelProperty(value = "函数路径", notes = "函数路径")
    private String path;
    /**
     * 版本
     */
    @ApiModelProperty(value = "版本", notes = "版本")
    private String version;
    /**
     * 当前审核者ID
     */
    @ApiModelProperty(value = "当前审核者ID", notes = "当前审核者ID")
    private Integer nowAuditorsId;
    /**
     * 当前维护者ID
     */
    @ApiModelProperty(value = "当前维护者ID", notes = "当前维护者ID")
    private Integer nowMaintenanceStaffId;
    /**
     * 开始使用时间
     */
    @ApiModelProperty(value = "开始使用时间", notes = "开始使用时间")
    private String startDate;
    /**
     * 退役时间
     */
    @ApiModelProperty(value = "退役时间", notes = "退役时间")
    private String endDate;
    /**
     * 函数文档ID
     */
    @ApiModelProperty(value = "函数文档ID", notes = "函数文档ID")
    private Integer functionDocId;
    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除", notes = "是否删除")
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getNowAuditorsId() {
        return nowAuditorsId;
    }

    public void setNowAuditorsId(Integer nowAuditorsId) {
        this.nowAuditorsId = nowAuditorsId;
    }

    public Integer getNowMaintenanceStaffId() {
        return nowMaintenanceStaffId;
    }

    public void setNowMaintenanceStaffId(Integer nowMaintenanceStaffId) {
        this.nowMaintenanceStaffId = nowMaintenanceStaffId;
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

    public Integer getFunctionDocId() {
        return functionDocId;
    }

    public void setFunctionDocId(Integer functionDocId) {
        this.functionDocId = functionDocId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}
