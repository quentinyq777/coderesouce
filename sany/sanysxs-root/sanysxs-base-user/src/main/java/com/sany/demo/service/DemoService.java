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
	
	/**
	 * @Title: demofindbyid
	 * @Description: 依据id进行查询
	 * @Author yuqun
	 * @DateTime 2018年11月13日 上午9:00:05
	 * @param id
	 * @return
	 */
	public BQ_Costormer demofindbyid(String id) {
		BQ_Costormer bq_costormer = bq_CostormerMapper.selectByPrimaryKey(id);
		return bq_costormer;
	}

	/**
	 * @Title: findPage
	 * @Description: 查询分页
	 * @Author yuqun
	 * @DateTime 2018年11月13日 上午9:00:32
	 * @param id
	 * @param pageRequest
	 * @return
	 */
	public PageInfo<BQ_Costormer> findPage(String id, PageRequest<BQ_Costormer> pageRequest) {
		BQ_CostormerExample example = new BQ_CostormerExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsflagEqualTo("1");
		PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
		PageInfo<BQ_Costormer> page = new PageInfo<BQ_Costormer>(bq_CostormerMapper.selectByExample(example));
		return page;
	}
	
    /**
     * 
     * @Title: update
     * @Description: 更新数据
     * @Author yuqun
     * @DateTime 2018年11月13日 上午9:00:57
     * @param bq_Costormer
     * @return
     */
	public Integer update(BQ_Costormer bq_Costormer) {
		int i = bq_CostormerMapper.updateByPrimaryKey(bq_Costormer);
		return i;
	}
}
