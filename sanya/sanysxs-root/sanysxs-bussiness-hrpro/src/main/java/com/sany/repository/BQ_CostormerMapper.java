package com.sany.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sany.entity.BQ_Costormer;
import com.sany.entity.BQ_CostormerExample;

public interface BQ_CostormerMapper {
    int countByExample(BQ_CostormerExample example);

    int deleteByExample(BQ_CostormerExample example);

    int deleteByPrimaryKey(String id);

    int insert(BQ_Costormer record);

    int insertSelective(BQ_Costormer record);

    List<BQ_Costormer> selectByExample(BQ_CostormerExample example);

    BQ_Costormer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BQ_Costormer record, @Param("example") BQ_CostormerExample example);

    int updateByExample(@Param("record") BQ_Costormer record, @Param("example") BQ_CostormerExample example);

    int updateByPrimaryKeySelective(BQ_Costormer record);

    int updateByPrimaryKey(BQ_Costormer record);
}