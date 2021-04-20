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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个函数更新信息")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUpdateInformationTable selectOne(@RequestBody Integer id) {
        return this.functionUpdateInformationTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有函数更新信息")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionUpdateInformationTable> selectAll() {
        return this.functionUpdateInformationTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个函数更新信息")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUpdateInformationTable addOne(@RequestBody FunctionUpdateInformationTable functionUpdateInformationTable) {
        return this.functionUpdateInformationTableService.insert(functionUpdateInformationTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个函数更新信息")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionUpdateInformationTable functionUpdateInformationTable) {
        return this.functionUpdateInformationTableService.deleteById(functionUpdateInformationTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return FunctionUpdateInformationTable
     */
    @ApiOperation("更新函数更新信息数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionUpdateInformationTable update(@RequestBody FunctionUpdateInformationTable functionUpdateInformationTable) {
        return this.functionUpdateInformationTableService.update(functionUpdateInformationTable);
    }

}
