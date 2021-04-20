package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.FunctionDocInformation;
import com.liupeng.project_doc.service.FunctionDocInformationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 函数文档详情表(FunctionDocInformation)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 20:29:56
 */
@Api(tags = {"函数文档详情管理"})
@RestController
@RequestMapping("functionDocInformation")
public class FunctionDocInformationController {
    /**
     * 服务对象
     */
    @Resource
    private FunctionDocInformationService functionDocInformationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个函数文档详情")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocInformation selectOne(@RequestBody Integer id) {
        return this.functionDocInformationService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有函数文档详情")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<FunctionDocInformation> selectAll() {
        return this.functionDocInformationService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个函数文档详情")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocInformation addOne(@RequestBody FunctionDocInformation functionDocInformation) {
        return this.functionDocInformationService.insert(functionDocInformation);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个函数文档详情")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody FunctionDocInformation functionDocInformation) {
        return this.functionDocInformationService.deleteById(functionDocInformation.getId());
    }

    /**
     * 删除一条数据
     *
     * @return FunctionDocInformation
     */
    @ApiOperation("更新函数文档详情数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public FunctionDocInformation update(@RequestBody FunctionDocInformation functionDocInformation) {
        return this.functionDocInformationService.update(functionDocInformation);
    }


}
