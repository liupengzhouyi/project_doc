package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 函数文档表(FunctionDocTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 20:27:54
 */
@ApiModel(value = "FunctionDocTable")
public class FunctionDocTable implements Serializable {
    private static final long serialVersionUID = 722471157087304834L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 函数ID
     */
    @ApiModelProperty(value = "函数ID", notes = "函数ID")
    private Integer functionId;
    /**
     * 文章链接ID
     */
    @ApiModelProperty(value = "文章链接ID", notes = "文章链接ID")
    private Integer linkPathId;
    /**
     * 维护人员ID
     */
    @ApiModelProperty(value = "维护人员ID", notes = "维护人员ID")
    private Integer maintenanceStaffId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Integer getLinkPathId() {
        return linkPathId;
    }

    public void setLinkPathId(Integer linkPathId) {
        this.linkPathId = linkPathId;
    }

    public Integer getMaintenanceStaffId() {
        return maintenanceStaffId;
    }

    public void setMaintenanceStaffId(Integer maintenanceStaffId) {
        this.maintenanceStaffId = maintenanceStaffId;
    }

}
