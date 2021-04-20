package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.FunctionDocTurnTable;
import com.liupeng.project_doc.dao.FunctionDocTurnTableDao;
import com.liupeng.project_doc.service.FunctionDocTurnTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 函数文档中转表(FunctionDocTurnTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 20:28:56
 */
@Service("functionDocTurnTableService")
public class FunctionDocTurnTableServiceImpl implements FunctionDocTurnTableService {
    @Resource
    private FunctionDocTurnTableDao functionDocTurnTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FunctionDocTurnTable queryById(Integer id) {
        return this.functionDocTurnTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FunctionDocTurnTable> queryAllByLimit(int offset, int limit) {
        return this.functionDocTurnTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<FunctionDocTurnTable> queryAll() {
        return this.functionDocTurnTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param functionDocTurnTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionDocTurnTable insert(FunctionDocTurnTable functionDocTurnTable) {
        this.functionDocTurnTableDao.insert(functionDocTurnTable);
        return functionDocTurnTable;
    }

    /**
     * 修改数据
     *
     * @param functionDocTurnTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionDocTurnTable update(FunctionDocTurnTable functionDocTurnTable) {
        this.functionDocTurnTableDao.update(functionDocTurnTable);
        return this.queryById(functionDocTurnTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.functionDocTurnTableDao.deleteById(id) > 0;
    }
}
