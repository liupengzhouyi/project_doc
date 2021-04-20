package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionUsed;
import com.liupeng.project_doc.service.FunctionUsedService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数引用表(FunctionUsed)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 20:26:15
 */
@Api(tags = {"函数调用管理"})
@RestController
@RequestMapping("functionUsed")
public class FunctionUsedController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionUsedService functionUsedService;

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUsedController.java
     * @description: 查询一个函数调用
     * @params: [id]
     * @return com.liupeng.project_doc.entity.FunctionUsed
     * @date: 20/04/2021 21:31
     * @author: liupeng
     */
    @ApiOperation("查询一个函数调用")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUsed selectOne(@RequestBody Integer id) {
        return this.functionUsedService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUsedController.java
     * @description: 查询所有函数调用
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.FunctionUsed>
     * @date: 20/04/2021 21:31
     * @author: liupeng
     */
    @ApiOperation("查询所有函数调用")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionUsed> selectAll() {
        return this.functionUsedService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUsedController.java
     * @description: 添加一个函数调用
     * @params: [functionUsed]
     * @return com.liupeng.project_doc.entity.FunctionUsed
     * @date: 20/04/2021 21:31
     * @author: liupeng
     */
    @ApiOperation("添加一个函数调用")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUsed addOne(@RequestBody FunctionUsed functionUsed) {
        return this.functionUsedService.insert(functionUsed);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUsedController.java
     * @description: 删除一个函数调用
     * @params: [functionUsed]
     * @return boolean
     * @date: 20/04/2021 21:32
     * @author: liupeng
     */
    @ApiOperation("删除一个函数调用")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionUsed functionUsed) {
        return this.functionUsedService.deleteById(functionUsed.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUsedController.java
     * @description: 更新数据函数调用
     * @params: [functionUsed]
     * @return com.liupeng.project_doc.entity.FunctionUsed
     * @date: 20/04/2021 21:32
     * @author: liupeng
     */
    @ApiOperation("更新数据函数调用")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUsed update(@RequestBody FunctionUsed functionUsed) {
        return this.functionUsedService.update(functionUsed);
    }


}
