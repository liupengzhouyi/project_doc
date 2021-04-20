package com.liupeng.project_doc.dao;

import com.liupeng.project_doc.entity.UserTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户表(UserTable)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-20 13:16:34
 */
@Mapper
public interface UserTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<UserTable> queryAll();

    /**
     * 新增数据
     *
     * @param userTable 实例对象
     * @return 影响行数
     */
    int insert(UserTable userTable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserTable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserTable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserTable> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<UserTable> entities);

    /**
     * 修改数据
     *
     * @param userTable 实例对象
     * @return 影响行数
     */
    int update(UserTable userTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

