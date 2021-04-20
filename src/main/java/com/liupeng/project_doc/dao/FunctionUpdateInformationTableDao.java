package com.liupeng.project_doc.dao;

import com.liupeng.project_doc.entity.FunctionUpdateInformationTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 函数更新信息表(FunctionUpdateInformationTable)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-20 20:33:38
 */
@Mapper
public interface FunctionUpdateInformationTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionUpdateInformationTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionUpdateInformationTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<FunctionUpdateInformationTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionUpdateInformationTable 实例对象
     * @return 影响行数
     */
    int insert(FunctionUpdateInformationTable functionUpdateInformationTable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionUpdateInformationTable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FunctionUpdateInformationTable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionUpdateInformationTable> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FunctionUpdateInformationTable> entities);

    /**
     * 修改数据
     *
     * @param functionUpdateInformationTable 实例对象
     * @return 影响行数
     */
    int update(FunctionUpdateInformationTable functionUpdateInformationTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

