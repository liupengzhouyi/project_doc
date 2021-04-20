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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个函数文档")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTable selectOne(@RequestBody Integer id) {
        return this.functionDocTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有函数文档")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionDocTable> selectAll() {
        return this.functionDocTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个函数文档")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTable addOne(@RequestBody FunctionDocTable functionDocTable) {
        return this.functionDocTableService.insert(functionDocTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个函数文档")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionDocTable functionDocTable) {
        return this.functionDocTableService.deleteById(functionDocTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return FunctionDocTable
     */
    @ApiOperation("更新函数文档数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTable update(@RequestBody FunctionDocTable functionDocTable) {
        return this.functionDocTableService.update(functionDocTable);
    }


}
