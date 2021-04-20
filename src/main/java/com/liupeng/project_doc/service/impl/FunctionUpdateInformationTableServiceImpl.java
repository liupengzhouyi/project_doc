package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.FunctionUpdateInformationTable;
import com.liupeng.project_doc.dao.FunctionUpdateInformationTableDao;
import com.liupeng.project_doc.service.FunctionUpdateInformationTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 函数更新信息表(FunctionUpdateInformationTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 20:33:38
 */
@Service("functionUpdateInformationTableService")
public class FunctionUpdateInformationTableServiceImpl implements FunctionUpdateInformationTableService {
    @Resource
    private FunctionUpdateInformationTableDao functionUpdateInformationTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FunctionUpdateInformationTable queryById(Integer id) {
        return this.functionUpdateInformationTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FunctionUpdateInformationTable> queryAllByLimit(int offset, int limit) {
        return this.functionUpdateInformationTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<FunctionUpdateInformationTable> queryAll() {
        return this.functionUpdateInformationTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param functionUpdateInformationTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionUpdateInformationTable insert(FunctionUpdateInformationTable functionUpdateInformationTable) {
        this.functionUpdateInformationTableDao.insert(functionUpdateInformationTable);
        return functionUpdateInformationTable;
    }

    /**
     * 修改数据
     *
     * @param functionUpdateInformationTable 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionUpdateInformationTable update(FunctionUpdateInformationTable functionUpdateInformationTable) {
        this.functionUpdateInformationTableDao.update(functionUpdateInformationTable);
        return this.queryById(functionUpdateInformationTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.functionUpdateInformationTableDao.deleteById(id) > 0;
    }
}
