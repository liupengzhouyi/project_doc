package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.FunctionTable;
import com.liupeng.project_doc.dao.FunctionTableDao;
import com.liupeng.project_doc.service.FunctionTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 函数表(FunctionTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 20:37:36
 */
@Service("functionTableService")
public class FunctionTableServiceImpl implements FunctionTableService {
    @Resource
    private FunctionTableDao functionTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FunctionTable queryById(Integer id) {
        return this.functionTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FunctionTable> queryAllByLimit(int offset, int limit) {
        return this.functionTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<FunctionTable> queryAll() {
        return this.functionTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param functionTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionTable insert(FunctionTable functionTable) {
        this.functionTableDao.insert(functionTable);
        return functionTable;
    }

    /**
     * 修改数据
     *
     * @param functionTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionTable update(FunctionTable functionTable) {
        this.functionTableDao.update(functionTable);
        return this.queryById(functionTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.functionTableDao.deleteById(id) > 0;
    }
}
