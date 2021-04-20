package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.FunctionUsed;
import com.liupeng.project_doc.dao.FunctionUsedDao;
import com.liupeng.project_doc.service.FunctionUsedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 函数引用表(FunctionUsed)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 20:26:15
 */
@Service("functionUsedService")
public class FunctionUsedServiceImpl implements FunctionUsedService {
    @Resource
    private FunctionUsedDao functionUsedDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FunctionUsed queryById(Integer id) {
        return this.functionUsedDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FunctionUsed> queryAllByLimit(int offset, int limit) {
        return this.functionUsedDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<FunctionUsed> queryAll() {
        return this.functionUsedDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param functionUsed 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionUsed insert(FunctionUsed functionUsed) {
        this.functionUsedDao.insert(functionUsed);
        return functionUsed;
    }

    /**
     * 修改数据
     *
     * @param functionUsed 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionUsed update(FunctionUsed functionUsed) {
        this.functionUsedDao.update(functionUsed);
        return this.queryById(functionUsed.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.functionUsedDao.deleteById(id) > 0;
    }
}
