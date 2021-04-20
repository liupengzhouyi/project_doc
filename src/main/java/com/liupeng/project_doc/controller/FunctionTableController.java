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
@Api(tags = {"管理"})
@RestController
@RequestMapping("functionTable")
public class FunctionTableController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionTableService functionTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionTable selectOne(@RequestBody Integer id) {
        return this.functionTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionTable> selectAll() {
        return this.functionTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionTable addOne(@RequestBody FunctionTable functionTable) {
        return this.functionTableService.insert(functionTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionTable functionTable) {
        return this.functionTableService.deleteById(functionTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return FunctionTable
     */
    @ApiOperation("更新数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionTable update(@RequestBody FunctionTable functionTable) {
        return this.functionTableService.update(functionTable);
    }


}
