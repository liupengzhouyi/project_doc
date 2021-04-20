package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.UserTable;
import com.liupeng.project_doc.dao.UserTableDao;
import com.liupeng.project_doc.service.UserTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(UserTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 13:16:37
 */
@Service("userTableService")
public class UserTableServiceImpl implements UserTableService {
    @Resource
    private UserTableDao userTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserTable queryById(Integer id) {
        return this.userTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserTable> queryAllByLimit(int offset, int limit) {
        return this.userTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<UserTable> queryAll() {
        return this.userTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param userTable 实例对象
     * @return 实例对象
     */
    @Override
    public UserTable insert(UserTable userTable) {
        this.userTableDao.insert(userTable);
        return userTable;
    }

    /**
     * 修改数据
     *
     * @param userTable 实例对象
     * @return 实例对象
     */
    @Override
    public UserTable update(UserTable userTable) {
        this.userTableDao.update(userTable);
        return this.queryById(userTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userTableDao.deleteById(id) > 0;
    }
}
