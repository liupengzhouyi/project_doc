package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.FunctionUpdateInformationTable;

import java.util.List;

/**
 * 函数更新信息表(FunctionUpdateInformationTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 20:33:38
 */
public interface FunctionUpdateInformationTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionUpdateInformationTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionUpdateInformationTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<FunctionUpdateInformationTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionUpdateInformationTable 实例对象
     * @return 实例对象
     */
    FunctionUpdateInformationTable insert(FunctionUpdateInformationTable functionUpdateInformationTable);

    /**
     * 修改数据
     *
     * @param functionUpdateInformationTable 实例对象
     * @return 实例对象
     */
    FunctionUpdateInformationTable update(FunctionUpdateInformationTable functionUpdateInformationTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
