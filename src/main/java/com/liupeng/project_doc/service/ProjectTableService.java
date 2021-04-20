package com.liupeng.project_doc.service;

import com.liupeng.project_doc.entity.ProjectTable;

import java.util.List;

/**
 * 项目表(ProjectTable)表服务接口
 *
 * @author liupeng
 * @since 2021-04-20 19:43:14
 */
public interface ProjectTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProjectTable queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProjectTable> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<ProjectTable> queryAll();

    /**
     * 新增数据
     *
     * @param projectTable 实例对象
     * @return 实例对象
     */
    ProjectTable insert(ProjectTable projectTable);

    /**
     * 修改数据
     *
     * @param projectTable 实例对象
     * @return 实例对象
     */
    ProjectTable update(ProjectTable projectTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
