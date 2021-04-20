package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.UserAnthorityTable;

import java.util.List;

/**
 * 用户权限表(UserAnthorityTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 19:41:20
 */
public interface UserAnthorityTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAnthorityTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserAnthorityTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<UserAnthorityTable> queryAll();

    /**
     * 新增数据
     *
     * @param userAnthorityTable 实例对象
     * @return 实例对象
     */
    UserAnthorityTable insert(UserAnthorityTable userAnthorityTable);

    /**
     * 修改数据
     *
     * @param userAnthorityTable 实例对象
     * @return 实例对象
     */
    UserAnthorityTable update(UserAnthorityTable userAnthorityTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
