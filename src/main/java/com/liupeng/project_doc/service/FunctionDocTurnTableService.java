package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.FunctionDocTurnTable;

import java.util.List;

/**
 * 函数文档中转表(FunctionDocTurnTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 20:28:56
 */
public interface FunctionDocTurnTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionDocTurnTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionDocTurnTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<FunctionDocTurnTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionDocTurnTable 实例对象
     * @return 实例对象
     */
    FunctionDocTurnTable insert(FunctionDocTurnTable functionDocTurnTable);

    /**
     * 修改数据
     *
     * @param functionDocTurnTable 实例对象
     * @return 实例对象
     */
    FunctionDocTurnTable update(FunctionDocTurnTable functionDocTurnTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
