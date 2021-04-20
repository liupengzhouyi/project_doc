package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.FunctionDocInformation;
import com.liupeng.project_doc.dao.FunctionDocInformationDao;
import com.liupeng.project_doc.service.FunctionDocInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 函数文档详情表(FunctionDocInformation)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 20:29:56
 */
@Service("functionDocInformationService")
public class FunctionDocInformationServiceImpl implements FunctionDocInformationService {
    @Resource
    private FunctionDocInformationDao functionDocInformationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FunctionDocInformation queryById(Integer id) {
        return this.functionDocInformationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FunctionDocInformation> queryAllByLimit(int offset, int limit) {
        return this.functionDocInformationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<FunctionDocInformation> queryAll() {
        return this.functionDocInformationDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param functionDocInformation 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionDocInformation insert(FunctionDocInformation functionDocInformation) {
        this.functionDocInformationDao.insert(functionDocInformation);
        return functionDocInformation;
    }

    /**
     * 修改数据
     *
     * @param functionDocInformation 实例对象
     * @return 实例对象
     */
    @Override
    public FunctionDocInformation update(FunctionDocInformation functionDocInformation) {
        this.functionDocInformationDao.update(functionDocInformation);
        return this.queryById(functionDocInformation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.functionDocInformationDao.deleteById(id) > 0;
    }
}
