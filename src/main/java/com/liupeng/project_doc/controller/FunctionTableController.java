package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionTable;
import com.liupeng.project_doc.service.FunctionTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数表(FunctionTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 20:37:37
 */
@Api(tags = {"函数管理"})
@RestController
@RequestMapping("functionTable")
public class FunctionTableController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionTableService functionTableService;

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionTableController.java
     * @description: 查询一个函数
     * @params: [id]
     * @return com.liupeng.project_doc.entity.FunctionTable
     * @date: 20/04/2021 21:27
     * @author: liupeng
     */
    @ApiOperation("查询一个函数")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionTable selectOne(@RequestBody Integer id) {
        return this.functionTableService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionTableController.java
     * @description: 查询所有函数
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.FunctionTable>
     * @date: 20/04/2021 21:28
     * @author: liupeng
     */
    @ApiOperation("查询所有函数")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionTable> selectAll() {
        return this.functionTableService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionTableController.java
     * @description: 添加一个函数
     * @params: [functionTable]
     * @return com.liupeng.project_doc.entity.FunctionTable
     * @date: 20/04/2021 21:28
     * @author: liupeng
     */
    @ApiOperation("添加一个函数")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionTable addOne(@RequestBody FunctionTable functionTable) {
        return this.functionTableService.insert(functionTable);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionTableController.java
     * @description: 删除一个函数
     * @params: [functionTable]
     * @return boolean
     * @date: 20/04/2021 21:29
     * @author: liupeng
     */
    @ApiOperation("删除一个函数")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionTable functionTable) {
        return this.functionTableService.deleteById(functionTable.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionTableController.java
     * @description: 更新函数数据
     * @params: [functionTable]
     * @return com.liupeng.project_doc.entity.FunctionTable
     * @date: 20/04/2021 21:29
     * @author: liupeng
     */
    @ApiOperation("更新函数数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionTable update(@RequestBody FunctionTable functionTable) {
        return this.functionTableService.update(functionTable);
    }


}
