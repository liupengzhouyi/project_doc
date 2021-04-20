package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 函数更新信息表(FunctionUpdateInformationTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 20:33:38
 */
@ApiModel(value = "FunctionUpdateInformationTable")
public class FunctionUpdateInformationTable implements Serializable {
    private static final long serialVersionUID = 244057744823006899L;
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
     * 版本
     */
    @ApiModelProperty(value = "版本", notes = "版本")
    private String version;
    /**
     * 维护者ID
     */
    @ApiModelProperty(value = "维护者ID", notes = "维护者ID")
    private Integer createId;
    /**
     * 会影响哪一个函数
     */
    @ApiModelProperty(value = "会影响哪一个函数", notes = "会影响哪一个函数")
    private Integer otherFunctionId;
    /**
     * 被影响函数维护者是否知道
     */
    @ApiModelProperty(value = "被影响函数维护者是否知道", notes = "被影响函数维护者是否知道")
    private Integer isKnow;
    /**
     * 受影响函数维护者是否收到通知
     */
    @ApiModelProperty(value = "受影响函数维护者是否收到通知", notes = "受影响函数维护者是否收到通知")
    private Integer getInformation;
    /**
     * 被影响函数是否排除问题
     */
    @ApiModelProperty(value = "被影响函数是否排除问题", notes = "被影响函数是否排除问题")
    private Integer doOver;


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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getOtherFunctionId() {
        return otherFunctionId;
    }

    public void setOtherFunctionId(Integer otherFunctionId) {
        this.otherFunctionId = otherFunctionId;
    }

    public Integer getIsKnow() {
        return isKnow;
    }

    public void setIsKnow(Integer isKnow) {
        this.isKnow = isKnow;
    }

    public Integer getGetInformation() {
        return getInformation;
    }

    public void setGetInformation(Integer getInformation) {
        this.getInformation = getInformation;
    }

    public Integer getDoOver() {
        return doOver;
    }

    public void setDoOver(Integer doOver) {
        this.doOver = doOver;
    }

}
