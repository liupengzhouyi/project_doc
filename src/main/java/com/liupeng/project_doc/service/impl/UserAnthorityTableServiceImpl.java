package com.liupeng.project_doc.service.impl;

import com.liupeng.project_doc.entity.UserAnthorityTable;
import com.liupeng.project_doc.dao.UserAnthorityTableDao;
import com.liupeng.project_doc.service.UserAnthorityTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户权限表(UserAnthorityTable)表服务实现类
 *
 * @author liupeng
 * @since 2021-04-20 19:41:21
 */
@Service("userAnthorityTableService")
public class UserAnthorityTableServiceImpl implements UserAnthorityTableService {
    @Resource
    private UserAnthorityTableDao userAnthorityTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAnthorityTable queryById(Integer id) {
        return this.userAnthorityTableDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserAnthorityTable> queryAllByLimit(int offset, int limit) {
        return this.userAnthorityTableDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<UserAnthorityTable> queryAll() {
        return this.userAnthorityTableDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param userAnthorityTable 实例对象
     * @return 实例对象
     */
    @Override
    public UserAnthorityTable insert(UserAnthorityTable userAnthorityTable) {
        this.userAnthorityTableDao.insert(userAnthorityTable);
        return userAnthorityTable;
    }

    /**
     * 修改数据
     *
     * @param userAnthorityTable 实例对象
     * @return 实例对象
     */
    @Override
    public UserAnthorityTable update(UserAnthorityTable userAnthorityTable) {
        this.userAnthorityTableDao.update(userAnthorityTable);
        return this.queryById(userAnthorityTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userAnthorityTableDao.deleteById(id) > 0;
    }
}
