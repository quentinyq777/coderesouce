package com.sany.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sany.common.PageRequest;
import com.sany.entity.BQ_Costormer;
import com.sany.entity.BQ_CostormerExample;
import com.sany.entity.BQ_CostormerExample.Criteria;
import com.sany.repository.BQ_CostormerMapper;
@Service
public class DemoService {
	
	@Autowired
	private BQ_CostormerMapper bq_CostormerMapper;
	
	public BQ_Costormer demofindbyid(String id) {
		BQ_Costormer bq_costormer = bq_CostormerMapper.selectByPrimaryKey(id);
		return bq_costormer;
	}

	public PageInfo<BQ_Costormer> findPage(Long id, PageRequest<BQ_Costormer> pageRequest) {
		BQ_CostormerExample example = new BQ_CostormerExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsflagEqualTo("1");
		PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
		PageInfo<BQ_Costormer> page = new PageInfo<BQ_Costormer>(bq_CostormerMapper.selectByExample(example));
		return page;
	}

	public Integer update(BQ_Costormer bq_Costormer) {
		System.out.println("wo shi hr");
		int i = bq_CostormerMapper.updateByPrimaryKeySelective(bq_Costormer);
		return i;
	}
}
