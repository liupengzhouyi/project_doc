package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.UserTable;
import com.liupeng.project_doc.service.UserTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 用户表(UserTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 13:16:38
 */
@Api(tags = {"用户管理"})
@RestController
@RequestMapping("userTable")
public class UserTableController {
    /**
     * 服务对象
     */
    @Resource
    private UserTableService userTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个用户")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserTable selectOne(@RequestBody Integer id) {
        return this.userTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有用户")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<UserTable> selectAll() {
        return this.userTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserTable addOne(@RequestBody UserTable userTable) {
        return this.userTableService.insert(userTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个用户")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody UserTable userTable) {
        return this.userTableService.deleteById(userTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return UserTable
     */
    @ApiOperation("更新用户数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserTable update(@RequestBody UserTable userTable) {
        return this.userTableService.update(userTable);
    }


}
