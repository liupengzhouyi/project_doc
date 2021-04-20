package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.UserTable;

import java.util.List;

/**
 * 用户表(UserTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 13:16:35
 */
public interface UserTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<UserTable> queryAll();

    /**
     * 新增数据
     *
     * @param userTable 实例对象
     * @return 实例对象
     */
    UserTable insert(UserTable userTable);

    /**
     * 修改数据
     *
     * @param userTable 实例对象
     * @return 实例对象
     */
    UserTable update(UserTable userTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
