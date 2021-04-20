package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 函数文档详情表(FunctionDocInformation)实体类
 *
 * @author liupeng
 * @since 2021-04-20 20:29:56
 */
@ApiModel(value = "FunctionDocInformation")
public class FunctionDocInformation implements Serializable {
    private static final long serialVersionUID = -50653492869028014L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 文档详情
     */
    @ApiModelProperty(value = "文档详情", notes = "文档详情")
    private String information;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

}
