package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionDocInformation;
import com.liupeng.project_doc.service.FunctionDocInformationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数文档详情表(FunctionDocInformation)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 20:29:56
 */
@Api(tags = {"函数文档详情管理"})
@RestController
@RequestMapping("functionDocInformation")
public class FunctionDocInformationController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionDocInformationService functionDocInformationService;

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocInformationController.java
     * @description: 查询一个函数文档详情
     * @params: [id]
     * @return com.liupeng.project_doc.entity.FunctionDocInformation
     * @date: 20/04/2021 21:21
     * @author: liupeng
     */
    @ApiOperation("查询一个函数文档详情")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocInformation selectOne(@RequestBody Integer id) {
        return this.functionDocInformationService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocInformationController.java
     * @description: 查询所有函数文档详情
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.FunctionDocInformation>
     * @date: 20/04/2021 21:20
     * @author: liupeng
     */
    @ApiOperation("查询所有函数文档详情")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionDocInformation> selectAll() {
        return this.functionDocInformationService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocInformationController.java
     * @description: 添加一个函数文档详情
     * @params: [functionDocInformation]
     * @return com.liupeng.project_doc.entity.FunctionDocInformation
     * @date: 20/04/2021 21:19
     * @author: liupeng
     */
    @ApiOperation("添加一个函数文档详情")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocInformation addOne(@RequestBody FunctionDocInformation functionDocInformation) {
        return this.functionDocInformationService.insert(functionDocInformation);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocInformationController.java
     * @description: 删除一个函数文档详情
     * @params: [functionDocInformation]
     * @return boolean
     * @date: 20/04/2021 21:20
     * @author: liupeng
     */
    @ApiOperation("删除一个函数文档详情")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionDocInformation functionDocInformation) {
        return this.functionDocInformationService.deleteById(functionDocInformation.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocInformationController.java
     * @description: 更新函数文档详情数据
     * @params: [functionDocInformation]
     * @return com.liupeng.project_doc.entity.FunctionDocInformation
     * @date: 20/04/2021 21:20
     * @author: liupeng
     */
    @ApiOperation("更新函数文档详情数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocInformation update(@RequestBody FunctionDocInformation functionDocInformation) {
        return this.functionDocInformationService.update(functionDocInformation);
    }


}
