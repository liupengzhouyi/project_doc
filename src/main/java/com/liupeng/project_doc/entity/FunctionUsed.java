package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 函数引用表(FunctionUsed)实体类
 *
 * @author liupeng
 * @since 2021-04-20 20:26:15
 */
@ApiModel(value = "FunctionUsed")
public class FunctionUsed implements Serializable {
    private static final long serialVersionUID = -47058004350458379L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 被引用函数
     */
    @ApiModelProperty(value = "被引用函数", notes = "被引用函数")
    private Integer functionId;
    /**
     * 引用函数
     */
    @ApiModelProperty(value = "引用函数", notes = "引用函数")
    private Integer functionIdUsing;
    /**
     * 开始引用时间
     */
    @ApiModelProperty(value = "开始引用时间", notes = "开始引用时间")
    private String startData;
    /**
     * 结束引用时间
     */
    @ApiModelProperty(value = "结束引用时间", notes = "结束引用时间")
    private String endData;
    /**
     * 是否还在使用
     */
    @ApiModelProperty(value = "是否还在使用", notes = "是否还在使用")
    private Integer isUsing;


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

    public Integer getFunctionIdUsing() {
        return functionIdUsing;
    }

    public void setFunctionIdUsing(Integer functionIdUsing) {
        this.functionIdUsing = functionIdUsing;
    }

    public String getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        this.startData = startData;
    }

    public String getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        this.endData = endData;
    }

    public Integer getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(Integer isUsing) {
        this.isUsing = isUsing;
    }

}
