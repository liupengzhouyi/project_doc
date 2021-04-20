package com.liupeng.project_doc.dao;

import com.liupeng.project_doc.entity.FunctionUsed;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 函数引用表(FunctionUsed)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-20 20:26:15
 */
@Mapper
public interface FunctionUsedDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionUsed queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionUsed> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<FunctionUsed> queryAll();

    /**
     * 新增数据
     *
     * @param functionUsed 实例对象
     * @return 影响行数
     */
    int insert(FunctionUsed functionUsed);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionUsed> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FunctionUsed> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionUsed> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FunctionUsed> entities);

    /**
     * 修改数据
     *
     * @param functionUsed 实例对象
     * @return 影响行数
     */
    int update(FunctionUsed functionUsed);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

