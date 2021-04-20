package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.ProjectTable;
import com.liupeng.project_doc.service.ProjectTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 项目表(ProjectTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 19:43:15
 */
@Api(tags = {"项目管理"})
@RestController
@RequestMapping("projectTable")
public class ProjectTableController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectTableService projectTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个项目")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ProjectTable selectOne(@RequestBody Integer id) {
        return this.projectTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有项目")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<ProjectTable> selectAll() {
        return this.projectTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个项目")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ProjectTable addOne(@RequestBody ProjectTable projectTable) {
        return this.projectTableService.insert(projectTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个项目")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody ProjectTable projectTable) {
        return this.projectTableService.deleteById(projectTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return ProjectTable
     */
    @ApiOperation("更新项目数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ProjectTable update(@RequestBody ProjectTable projectTable) {
        return this.projectTableService.update(projectTable);
    }


}
