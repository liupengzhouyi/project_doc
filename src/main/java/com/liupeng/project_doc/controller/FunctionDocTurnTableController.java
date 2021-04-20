package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionDocTurnTable;
import com.liupeng.project_doc.service.FunctionDocTurnTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数文档中转表(FunctionDocTurnTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 20:28:56
 */
@Api(tags = {"函数文档索引管理"})
@RestController
@RequestMapping("functionDocTurnTable")
public class FunctionDocTurnTableController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionDocTurnTableService functionDocTurnTableService;

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTurnTableController.java
     * @description: 查询一个函数文档索引
     * @params: [id]
     * @return com.liupeng.project_doc.entity.FunctionDocTurnTable
     * @date: 20/04/2021 21:23
     * @author: liupeng
     */
    @ApiOperation("查询一个函数文档索引")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTurnTable selectOne(@RequestBody Integer id) {
        return this.functionDocTurnTableService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTurnTableController.java
     * @description: 查询所有函数文档索引
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.FunctionDocTurnTable>
     * @date: 20/04/2021 21:23
     * @author: liupeng
     */
    @ApiOperation("查询所有函数文档索引")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionDocTurnTable> selectAll() {
        return this.functionDocTurnTableService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTurnTableController.java
     * @description: 添加一个函数文档索引
     * @params: [functionDocTurnTable]
     * @return com.liupeng.project_doc.entity.FunctionDocTurnTable
     * @date: 20/04/2021 21:23
     * @author: liupeng
     */
    @ApiOperation("添加一个函数文档索引")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTurnTable addOne(@RequestBody FunctionDocTurnTable functionDocTurnTable) {
        return this.functionDocTurnTableService.insert(functionDocTurnTable);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTurnTableController.java
     * @description: 删除一个函数文档索引
     * @params: [functionDocTurnTable]
     * @return boolean
     * @date: 20/04/2021 21:23
     * @author: liupeng
     */
    @ApiOperation("删除一个函数文档索引")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionDocTurnTable functionDocTurnTable) {
        return this.functionDocTurnTableService.deleteById(functionDocTurnTable.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTurnTableController.java
     * @description: 更新函数文档索引数据
     * @params: [functionDocTurnTable]
     * @return com.liupeng.project_doc.entity.FunctionDocTurnTable
     * @date: 20/04/2021 21:23
     * @author: liupeng
     */
    @ApiOperation("更新函数文档索引数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTurnTable update(@RequestBody FunctionDocTurnTable functionDocTurnTable) {
        return this.functionDocTurnTableService.update(functionDocTurnTable);
    }


}
