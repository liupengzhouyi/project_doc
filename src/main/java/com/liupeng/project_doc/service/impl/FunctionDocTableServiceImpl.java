package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.FunctionDocTable;
import com.liupeng.project_doc.dao.FunctionDocTableDao;
import com.liupeng.project_doc.service.FunctionDocTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 函数文档表(FunctionDocTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 20:27:55
 */
@Service("functionDocTableService")
public class FunctionDocTableServiceImpl implements FunctionDocTableService {
    @Resource
    private FunctionDocTableDao functionDocTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FunctionDocTable queryById(Integer id) {
        return this.functionDocTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FunctionDocTable> queryAllByLimit(int offset, int limit) {
        return this.functionDocTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<FunctionDocTable> queryAll() {
        return this.functionDocTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param functionDocTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionDocTable insert(FunctionDocTable functionDocTable) {
        this.functionDocTableDao.insert(functionDocTable);
        return functionDocTable;
    }

    /**
     * 修改数据
     *
     * @param functionDocTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionDocTable update(FunctionDocTable functionDocTable) {
        this.functionDocTableDao.update(functionDocTable);
        return this.queryById(functionDocTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.functionDocTableDao.deleteById(id) > 0;
    }
}
