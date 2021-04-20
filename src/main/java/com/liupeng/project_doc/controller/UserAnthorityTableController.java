package com.liupeng.project_doc.controller;

import com.liupeng.project_doc.entity.UserAnthorityTable;
import com.liupeng.project_doc.service.UserAnthorityTableService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
 * 用户权限表(UserAnthorityTable)表控制层
 *
 * @author liupeng
 * @since 2021-04-20 19:41:21
 */
@Api(tags = {"用户权限管理"})
@RestController
@RequestMapping("userAnthorityTable")
public class UserAnthorityTableController {
    /**
     * 服务对象
     */
    @Resource
    private UserAnthorityTableService userAnthorityTableService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个用户权限")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserAnthorityTable selectOne(@RequestBody Integer id) {
        return this.userAnthorityTableService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有用户权限")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<UserAnthorityTable> selectAll() {
        return this.userAnthorityTableService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个用户权限")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserAnthorityTable addOne(@RequestBody UserAnthorityTable userAnthorityTable) {
        return this.userAnthorityTableService.insert(userAnthorityTable);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个用户权限")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(@RequestBody UserAnthorityTable userAnthorityTable) {
        return this.userAnthorityTableService.deleteById(userAnthorityTable.getId());
    }

    /**
     * 删除一条数据
     *
     * @return UserAnthorityTable
     */
    @ApiOperation("更新用户权限数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public UserAnthorityTable update(@RequestBody UserAnthorityTable userAnthorityTable) {
        return this.userAnthorityTableService.update(userAnthorityTable);
    }


}
