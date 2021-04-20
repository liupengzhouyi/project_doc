package com.liupeng.project_doc.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 函数文档中转表(FunctionDocTurnTable)实体类
 *
 * @author liupeng
 * @since 2021-04-20 20:28:55
 */
@ApiModel(value = "FunctionDocTurnTable")
public class FunctionDocTurnTable implements Serializable {
    private static final long serialVersionUID = 697597601497428506L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 函数文档链接ID
     */
    @ApiModelProperty(value = "函数文档链接ID", notes = "函数文档链接ID")
    private Integer linkPathId;
    /**
     * 函数详细信息ID
     */
    @ApiModelProperty(value = "函数详细信息ID", notes = "函数详细信息ID")
    private Integer docInformationId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLinkPathId() {
        return linkPathId;
    }

    public void setLinkPathId(Integer linkPathId) {
        this.linkPathId = linkPathId;
    }

    public Integer getDocInformationId() {
        return docInformationId;
    }

    public void setDocInformationId(Integer docInformationId) {
        this.docInformationId = docInformationId;
    }

}
