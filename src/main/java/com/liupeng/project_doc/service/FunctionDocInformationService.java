package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.FunctionDocInformation;

import java.util.List;

/**
 * 函数文档详情表(FunctionDocInformation)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 20:29:56
 */
public interface FunctionDocInformationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionDocInformation queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionDocInformation> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<FunctionDocInformation> queryAll();

    /**
     * 新增数据
     *
     * @param functionDocInformation 实例对象
     * @return 实例对象
     */
    FunctionDocInformation insert(FunctionDocInformation functionDocInformation);

    /**
     * 修改数据
     *
     * @param functionDocInformation 实例对象
     * @return 实例对象
     */
    FunctionDocInformation update(FunctionDocInformation functionDocInformation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
