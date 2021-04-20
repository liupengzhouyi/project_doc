package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.AnthorityTable;

import java.util.List;

/**
 * 权限表(AnthorityTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 19:23:04
 */
public interface AnthorityTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AnthorityTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AnthorityTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<AnthorityTable> queryAll();

    /**
     * 新增数据
     *
     * @param anthorityTable 实例对象
     * @return 实例对象
     */
    AnthorityTable insert(AnthorityTable anthorityTable);

    /**
     * 修改数据
     *
     * @param anthorityTable 实例对象
     * @return 实例对象
     */
    AnthorityTable update(AnthorityTable anthorityTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
