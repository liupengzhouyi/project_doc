package com.liupeng.project_doc.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @className: GeneralReturnClass
 * @description: 通用返回类
 * @author: liupeng_cat
 * @date: 20/04/2021
 **/
@ApiModel(value = "通用返回类")
public class GeneralReturnClass {

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "时间")
    private String time;

    @ApiModelProperty(value = "做了什么")
    private String what;

    @ApiModelProperty(value = "是否成功")
    private boolean returnKey;

    @ApiModelProperty(value = "返回对象")
    private Object returnObject;

    @ApiModelProperty(value = "为什么错误")
    private String why;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public boolean isReturnKey() {
        return returnKey;
    }

    public void setReturnKey(boolean returnKey) {
        this.returnKey = returnKey;
    }

    public Object getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(Object returnObject) {
        this.returnObject = returnObject;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    @Override
    public String toString() {
        return "GeneralReturnClass{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", what='" + what + '\'' +
                ", returnKey=" + returnKey +
                ", returnObject=" + returnObject +
                ", why='" + why + '\'' +
                '}';
    }
}
