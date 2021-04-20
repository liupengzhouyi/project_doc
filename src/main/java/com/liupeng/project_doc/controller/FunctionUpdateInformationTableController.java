package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionUpdateInformationTable;
import com.liupeng.project_doc.service.FunctionUpdateInformationTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数更新信息表(FunctionUpdateInformationTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 20:33:38
 */
@Api(tags = {"函数更新信息管理"})
@RestController
@RequestMapping("functionUpdateInformationTable")
public class FunctionUpdateInformationTableController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionUpdateInformationTableService functionUpdateInformationTableService;

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUpdateInformationTableController.java
     * @description: 查询一个函数更新信息
     * @params: [id]
     * @return com.liupeng.project_doc.entity.FunctionUpdateInformationTable
     * @date: 20/04/2021 21:29
     * @author: liupeng
     */
    @ApiOperation("查询一个函数更新信息")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUpdateInformationTable selectOne(@RequestBody Integer id) {
        return this.functionUpdateInformationTableService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUpdateInformationTableController.java
     * @description: 查询所有函数更新信息
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.FunctionUpdateInformationTable>
     * @date: 20/04/2021 21:30
     * @author: liupeng
     */
    @ApiOperation("查询所有函数更新信息")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionUpdateInformationTable> selectAll() {
        return this.functionUpdateInformationTableService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUpdateInformationTableController.java
     * @description: 添加一个函数更新信息
     * @params: [functionUpdateInformationTable]
     * @return com.liupeng.project_doc.entity.FunctionUpdateInformationTable
     * @date: 20/04/2021 21:30
     * @author: liupeng
     */
    @ApiOperation("添加一个函数更新信息")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUpdateInformationTable addOne(@RequestBody FunctionUpdateInformationTable functionUpdateInformationTable) {
        return this.functionUpdateInformationTableService.insert(functionUpdateInformationTable);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUpdateInformationTableController.java
     * @description: 删除一个函数更新信息
     * @params: [functionUpdateInformationTable]
     * @return boolean
     * @date: 20/04/2021 21:30
     * @author: liupeng
     */
    @ApiOperation("删除一个函数更新信息")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionUpdateInformationTable functionUpdateInformationTable) {
        return this.functionUpdateInformationTableService.deleteById(functionUpdateInformationTable.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionUpdateInformationTableController.java
     * @description: 更新函数更新信息数据
     * @params: [functionUpdateInformationTable]
     * @return com.liupeng.project_doc.entity.FunctionUpdateInformationTable
     * @date: 20/04/2021 21:30
     * @author: liupeng
     */
    @ApiOperation("更新函数更新信息数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUpdateInformationTable update(@RequestBody FunctionUpdateInformationTable functionUpdateInformationTable) {
        return this.functionUpdateInformationTableService.update(functionUpdateInformationTable);
    }

}
