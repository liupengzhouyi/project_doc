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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个函数文档索引")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTurnTable selectOne(@RequestBody Integer id) {
        return this.functionDocTurnTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有函数文档索引")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionDocTurnTable> selectAll() {
        return this.functionDocTurnTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个函数文档索引")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTurnTable addOne(@RequestBody FunctionDocTurnTable functionDocTurnTable) {
        return this.functionDocTurnTableService.insert(functionDocTurnTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个函数文档索引")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionDocTurnTable functionDocTurnTable) {
        return this.functionDocTurnTableService.deleteById(functionDocTurnTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return FunctionDocTurnTable
     */
    @ApiOperation("更新函数文档索引数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocTurnTable update(@RequestBody FunctionDocTurnTable functionDocTurnTable) {
        return this.functionDocTurnTableService.update(functionDocTurnTable);
    }


}
