package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 函数审核表(FunctionAuditorsTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 19:59:40
 */
@ApiModel(value = "FunctionAuditorsTable")
public class FunctionAuditorsTable implements Serializable {
    private static final long serialVersionUID = 472881640255280259L;
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
     * 审核人ID
     */
    @ApiModelProperty(value = "审核人ID", notes = "审核人ID")
    private Integer auditorsId;


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

    public Integer getAuditorsId() {
        return auditorsId;
    }

    public void setAuditorsId(Integer auditorsId) {
        this.auditorsId = auditorsId;
    }

}
