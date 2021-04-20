package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.ProjectTable;
import com.liupeng.project_doc.dao.ProjectTableDao;
import com.liupeng.project_doc.service.ProjectTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目表(ProjectTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 19:43:14
 */
@Service("projectTableService")
public class ProjectTableServiceImpl implements ProjectTableService {
    @Resource
    private ProjectTableDao projectTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProjectTable queryById(Integer id) {
        return this.projectTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ProjectTable> queryAllByLimit(int offset, int limit) {
        return this.projectTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<ProjectTable> queryAll() {
        return this.projectTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param projectTable 实例对象
     * @return 实例对象
     */
    @Override
    public ProjectTable insert(ProjectTable projectTable) {
        this.projectTableDao.insert(projectTable);
        return projectTable;
    }

    /**
     * 修改数据
     *
     * @param projectTable 实例对象
     * @return 实例对象
     */
    @Override
    public ProjectTable update(ProjectTable projectTable) {
        this.projectTableDao.update(projectTable);
        return this.queryById(projectTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.projectTableDao.deleteById(id) > 0;
    }
}
