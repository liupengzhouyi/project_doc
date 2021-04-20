package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.FunctionDocTable;

import java.util.List;

/**
 * 函数文档表(FunctionDocTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 20:27:54
 */
public interface FunctionDocTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionDocTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionDocTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<FunctionDocTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionDocTable 实例对象
     * @return 实例对象
     */
    FunctionDocTable insert(FunctionDocTable functionDocTable);

    /**
     * 修改数据
     *
     * @param functionDocTable 实例对象
     * @return 实例对象
     */
    FunctionDocTable update(FunctionDocTable functionDocTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
