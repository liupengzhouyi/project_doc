package com.liupeng.project_doc.dao;

import com.liupeng.project_doc.entity.FunctionDocTurnTable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 函数文档中转表(FunctionDocTurnTable)表数据库访问层
 *
 * @author liupeng
 * @since 2021-04-20 20:28:55
 */
@Mapper
public interface FunctionDocTurnTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FunctionDocTurnTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FunctionDocTurnTable> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<FunctionDocTurnTable> queryAll();

    /**
     * 新增数据
     *
     * @param functionDocTurnTable 实例对象
     * @return 影响行数
     */
    int insert(FunctionDocTurnTable functionDocTurnTable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionDocTurnTable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FunctionDocTurnTable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FunctionDocTurnTable> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FunctionDocTurnTable> entities);

    /**
     * 修改数据
     *
     * @param functionDocTurnTable 实例对象
     * @return 影响行数
     */
    int update(FunctionDocTurnTable functionDocTurnTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

