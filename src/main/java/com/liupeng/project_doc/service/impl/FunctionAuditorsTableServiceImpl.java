package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.FunctionAuditorsTable;
import com.liupeng.project_doc.dao.FunctionAuditorsTableDao;
import com.liupeng.project_doc.service.FunctionAuditorsTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 函数审核表(FunctionAuditorsTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 19:59:40
 */
@Service("functionAuditorsTableService")
public class FunctionAuditorsTableServiceImpl implements FunctionAuditorsTableService {
    @Resource
    private FunctionAuditorsTableDao functionAuditorsTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FunctionAuditorsTable queryById(Integer id) {
        return this.functionAuditorsTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FunctionAuditorsTable> queryAllByLimit(int offset, int limit) {
        return this.functionAuditorsTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<FunctionAuditorsTable> queryAll() {
        return this.functionAuditorsTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param functionAuditorsTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionAuditorsTable insert(FunctionAuditorsTable functionAuditorsTable) {
        this.functionAuditorsTableDao.insert(functionAuditorsTable);
        return functionAuditorsTable;
    }

    /**
     * 修改数据
     *
     * @param functionAuditorsTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionAuditorsTable update(FunctionAuditorsTable functionAuditorsTable) {
        this.functionAuditorsTableDao.update(functionAuditorsTable);
        return this.queryById(functionAuditorsTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.functionAuditorsTableDao.deleteById(id) > 0;
    }
}
