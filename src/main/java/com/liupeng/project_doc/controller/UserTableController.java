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
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/UserTableController.java
     * @description: 查询一个用户
     * @params: [id]
     * @return com.liupeng.project_doc.entity.UserTable
     * @date: 20/04/2021 21:33
     * @author: liupeng
     */
    @ApiOperation("查询一个用户")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserTable selectOne(@RequestBody Integer id) {
        return this.userTableService.queryById(id);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/UserTableController.java
     * @description: 查询所有用户
     * @params: []
     * @return java.util.List<com.liupeng.project_doc.entity.UserTable>
     * @date: 20/04/2021 21:34
     * @author: liupeng
     */
    @ApiOperation("查询所有用户")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<UserTable> selectAll() {
        return this.userTableService.queryAll();
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/UserTableController.java
     * @description: 添加一个用户
     * @params: [userTable]
     * @return com.liupeng.project_doc.entity.UserTable
     * @date: 20/04/2021 21:34
     * @author: liupeng
     */
    @ApiOperation("添加一个用户")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserTable addOne(@RequestBody UserTable userTable) {
        return this.userTableService.insert(userTable);
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/UserTableController.java
     * @description: 删除一个用户
     * @params: [userTable]
     * @return boolean
     * @date: 20/04/2021 21:34
     * @author: liupeng
     */
    @ApiOperation("删除一个用户")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody UserTable userTable) {
        return this.userTableService.deleteById(userTable.getId());
    }

    /**
     * functionID: TODO
     * @path: com/liupeng/project_doc/controller/UserTableController.java
     * @description: 更新用户数据
     * @params: [userTable]
     * @return com.liupeng.project_doc.entity.UserTable
     * @date: 20/04/2021 21:34
     * @author: liupeng
     */
    @ApiOperation("更新用户数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserTable update(@RequestBody UserTable userTable) {
        return this.userTableService.update(userTable);
    }


}
