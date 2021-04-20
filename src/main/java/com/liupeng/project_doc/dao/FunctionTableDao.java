package com.liupeng.project_doc.dao;

import com.liupeng.project_doc.entity.FunctionTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 函数表(FunctionTable)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-20 20:37:34
 */
@Mapper
public interface FunctionTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<FunctionTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionTable 实例对象
     * @return 影响行数
     */
    int insert(FunctionTable functionTable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionTable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FunctionTable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionTable> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FunctionTable> entities);

    /**
     * 修改数据
     *
     * @param functionTable 实例对象
     * @return 影响行数
     */
    int update(FunctionTable functionTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

