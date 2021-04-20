package com.liupeng.project_doc.dao;

import com.liupeng.project_doc.entity.UserAnthorityTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户权限表(UserAnthorityTable)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-20 19:41:20
 */
@Mapper
public interface UserAnthorityTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAnthorityTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserAnthorityTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<UserAnthorityTable> queryAll();

    /**
     * 新增数据
     *
     * @param userAnthorityTable 实例对象
     * @return 影响行数
     */
    int insert(UserAnthorityTable userAnthorityTable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAnthorityTable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserAnthorityTable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAnthorityTable> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<UserAnthorityTable> entities);

    /**
     * 修改数据
     *
     * @param userAnthorityTable 实例对象
     * @return 影响行数
     */
    int update(UserAnthorityTable userAnthorityTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

