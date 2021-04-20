package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.FunctionAuditorsTable;

import java.util.List;

/**
 * 函数审核表(FunctionAuditorsTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 19:59:40
 */
public interface FunctionAuditorsTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionAuditorsTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionAuditorsTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<FunctionAuditorsTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionAuditorsTable 实例对象
     * @return 实例对象
     */
    FunctionAuditorsTable insert(FunctionAuditorsTable functionAuditorsTable);

    /**
     * 修改数据
     *
     * @param functionAuditorsTable 实例对象
     * @return 实例对象
     */
    FunctionAuditorsTable update(FunctionAuditorsTable functionAuditorsTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
