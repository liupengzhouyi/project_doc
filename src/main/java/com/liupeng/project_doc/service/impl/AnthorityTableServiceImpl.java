package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.AnthorityTable;
import com.liupeng.project_doc.dao.AnthorityTableDao;
import com.liupeng.project_doc.service.AnthorityTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限表(AnthorityTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 19:23:04
 */
@Service("anthorityTableService")
public class AnthorityTableServiceImpl implements AnthorityTableService {
    @Resource
    private AnthorityTableDao anthorityTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AnthorityTable queryById(Integer id) {
        return this.anthorityTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<AnthorityTable> queryAllByLimit(int offset, int limit) {
        return this.anthorityTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<AnthorityTable> queryAll() {
        return this.anthorityTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param anthorityTable 实例对象
     * @return 实例对象
     */
    @Override
    public AnthorityTable insert(AnthorityTable anthorityTable) {
        this.anthorityTableDao.insert(anthorityTable);
        return anthorityTable;
    }

    /**
     * 修改数据
     *
     * @param anthorityTable 实例对象
     * @return 实例对象
     */
    @Override
    public AnthorityTable update(AnthorityTable anthorityTable) {
        this.anthorityTableDao.update(anthorityTable);
        return this.queryById(anthorityTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.anthorityTableDao.deleteById(id) > 0;
    }
}
