package com.liupeng.project_doc.dao;

import com.liupeng.project_doc.entity.FunctionDocTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 函数文档表(FunctionDocTable)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-20 20:27:54
 */
@Mapper
public interface FunctionDocTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionDocTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionDocTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<FunctionDocTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionDocTable 实例对象
     * @return 影响行数
     */
    int insert(FunctionDocTable functionDocTable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionDocTable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FunctionDocTable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionDocTable> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FunctionDocTable> entities);

    /**
     * 修改数据
     *
     * @param functionDocTable 实例对象
     * @return 影响行数
     */
    int update(FunctionDocTable functionDocTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

