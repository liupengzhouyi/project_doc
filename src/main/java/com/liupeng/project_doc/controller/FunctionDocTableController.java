package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionDocTable;
import com.liupeng.project_doc.service.FunctionDocTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数文档表(FunctionDocTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 20:27:55
 */
@Api(tags = {"函数文档管理"})
@RestController
@RequestMapping("functionDocTable")
public class FunctionDocTableController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionDocTableService functionDocTableService;

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTableController.java
     * @description: 查询一个函数文档
     * @params: [id]
     * @return com.liupeng.project_doc.entity.FunctionDocTable
     * @date: 20/04/2021 21:22
     * @author: liupeng
     */
    @ApiOperation("查询一个函数文档")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTable selectOne(@RequestBody Integer id) {
        return this.functionDocTableService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTableController.java
     * @description: 查询所有函数文档
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.FunctionDocTable>
     * @date: 20/04/2021 21:22
     * @author: liupeng
     */
    @ApiOperation("查询所有函数文档")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionDocTable> selectAll() {
        return this.functionDocTableService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTableController.java
     * @description: 添加一个函数文档
     * @params: [functionDocTable]
     * @return com.liupeng.project_doc.entity.FunctionDocTable
     * @date: 20/04/2021 21:22
     * @author: liupeng
     */
    @ApiOperation("添加一个函数文档")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTable addOne(@RequestBody FunctionDocTable functionDocTable) {
        return this.functionDocTableService.insert(functionDocTable);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTableController.java
     * @description: 删除一个函数文档
     * @params: [functionDocTable]
     * @return boolean
     * @date: 20/04/2021 21:22
     * @author: liupeng
     */
    @ApiOperation("删除一个函数文档")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionDocTable functionDocTable) {
        return this.functionDocTableService.deleteById(functionDocTable.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/FunctionDocTableController.java
     * @description: 更新函数文档数据
     * @params: [functionDocTable]
     * @return com.liupeng.project_doc.entity.FunctionDocTable
     * @date: 20/04/2021 21:22
     * @author: liupeng
     */
    @ApiOperation("更新函数文档数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTable update(@RequestBody FunctionDocTable functionDocTable) {
        return this.functionDocTableService.update(functionDocTable);
    }


}
