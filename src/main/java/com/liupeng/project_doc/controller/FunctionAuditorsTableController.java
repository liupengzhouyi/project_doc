package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionAuditorsTable;
import com.liupeng.project_doc.service.FunctionAuditorsTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数审核表(FunctionAuditorsTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 19:59:41
 */
@Api(tags = {"函数审核管理"})
@RestController
@RequestMapping("functionAuditorsTable")
public class FunctionAuditorsTableController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionAuditorsTableService functionAuditorsTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个函数审核")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionAuditorsTable selectOne(@RequestBody Integer id) {
        return this.functionAuditorsTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有函数审核")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionAuditorsTable> selectAll() {
        return this.functionAuditorsTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个函数审核")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionAuditorsTable addOne(@RequestBody FunctionAuditorsTable functionAuditorsTable) {
        return this.functionAuditorsTableService.insert(functionAuditorsTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个函数审核")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionAuditorsTable functionAuditorsTable) {
        return this.functionAuditorsTableService.deleteById(functionAuditorsTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return FunctionAuditorsTable
     */
    @ApiOperation("更新函数审核数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionAuditorsTable update(@RequestBody FunctionAuditorsTable functionAuditorsTable) {
        return this.functionAuditorsTableService.update(functionAuditorsTable);
    }


}
