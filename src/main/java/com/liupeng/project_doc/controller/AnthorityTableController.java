package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.AnthorityTable;
import com.liupeng.project_doc.service.AnthorityTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 权限表(AnthorityTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 19:23:04
 */
@Api(tags = {"权限管理"})
@RestController
@RequestMapping("anthorityTable")
public class AnthorityTableController {
    /**
     * 服务对象
     */
    @Resource
    private AnthorityTableService anthorityTableService;

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/AnthorityTableController.java
     * @description: 通过主键查询单条数据
     * @params: [id]
     * @return com.liupeng.project_doc.entity.AnthorityTable
     * @date: 20/04/2021 21:14
     * @author: liupeng
     */
    @ApiOperation("查询一个权限")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public AnthorityTable selectOne(@RequestBody Integer id) {
        return this.anthorityTableService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/AnthorityTableController.java
     * @description: 查询所有数据
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.AnthorityTable>
     * @date: 20/04/2021 21:15
     * @author: liupeng
     */
    @ApiOperation("查询所有权限")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<AnthorityTable> selectAll() {
        return this.anthorityTableService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/AnthorityTableController.java
     * @description: 添加一条数据
     * @params: [anthorityTable]
     * @return com.liupeng.project_doc.entity.AnthorityTable
     * @date: 20/04/2021 21:13
     * @author: liupeng
     */
    @ApiOperation("添加一个权限")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public AnthorityTable addOne(@RequestBody AnthorityTable anthorityTable) {
        return this.anthorityTableService.insert(anthorityTable);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/AnthorityTableController.java
     * @description: 删除一条数据
     * @params: [anthorityTable]
     * @return boolean
     * @date: 20/04/2021 21:14
     * @author: liupeng
     */
    @ApiOperation("删除一个权限")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody AnthorityTable anthorityTable) {
        return this.anthorityTableService.deleteById(anthorityTable.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/AnthorityTableController.java
     * @description: 删除一条数据
     * @params: [anthorityTable]
     * @return com.liupeng.project_doc.entity.AnthorityTable
     * @date: 20/04/2021 21:15
     * @author: liupeng
     */
    @ApiOperation("更新权限数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public AnthorityTable update(@RequestBody AnthorityTable anthorityTable) {
        return this.anthorityTableService.update(anthorityTable);
    }


}
