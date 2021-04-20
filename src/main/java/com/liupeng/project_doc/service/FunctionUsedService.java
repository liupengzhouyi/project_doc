package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.FunctionUsed;

import java.util.List;

/**
 * 函数引用表(FunctionUsed)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 20:26:15
 */
public interface FunctionUsedService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionUsed queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionUsed> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<FunctionUsed> queryAll();

    /**
     * 新增数据
     *
     * @param functionUsed 实例对象
     * @return 实例对象
     */
    FunctionUsed insert(FunctionUsed functionUsed);

    /**
     * 修改数据
     *
     * @param functionUsed 实例对象
     * @return 实例对象
     */
    FunctionUsed update(FunctionUsed functionUsed);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
