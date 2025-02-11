package com.yc.atcrowdfunding.dao;

import com.yc.atcrowdfunding.bean.TReturn;
import com.yc.atcrowdfunding.bean.TReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TReturnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int countByExample(TReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int deleteByExample(TReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int insert(TReturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int insertSelective(TReturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    List<TReturn> selectByExample(TReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    TReturn selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") TReturn record, @Param("example") TReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByExample(@Param("record") TReturn record, @Param("example") TReturnExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(TReturn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_return
     *
     * @mbggenerated Wed Aug 21 11:28:20 GMT+08:00 2019
     */
    int updateByPrimaryKey(TReturn record);
}