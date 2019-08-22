package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TParam;
import com.yc.atcrowdfunding.bean.TParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int countByExample(TParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int deleteByExample(TParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int insert(TParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int insertSelective(TParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    List<TParam> selectByExample(TParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    TParam selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TParam record, @Param("example") TParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TParam record, @Param("example") TParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_param
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByPrimaryKey(TParam record);
}