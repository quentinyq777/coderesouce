package com.sany.demo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.sany.common.DataResult;
import com.sany.common.PageRequest;
import com.sany.common.utils.UserMess;
import com.sany.demo.feignservice.CoustomerService;
import com.sany.demo.feignservice.DemoFeignService;
import com.sany.demo.service.DemoService;
import com.sany.entity.BQ_Costormer;
import com.sany.enums.ErrorType;

/**
 * 
 * @ClassName: DemoController
 * @Description: demo
 * @Author yuqun
 * @DateTime 2018年11月12日 下午2:45:08
 */
@RestController
@RequestMapping("/demofeign")
public class DemoFeignController {
	@Autowired
	private DemoFeignService demoFeignService;
	
	/**
	 * @Title: test
	 * @Description: 
	 * @Author yuqun
	 * @DateTime 2018年11月12日 下午2:43:56
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "demoFeignFindById/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<BQ_Costormer> demoFeignFindById(@PathVariable String id) {
		DataResult<BQ_Costormer> dr;
		if (null == id) {
			dr = DataResult.failure(ErrorType.PARAM_ERROR);
		} else {
			BQ_Costormer bq = new BQ_Costormer();
			dr = demoFeignService.demofindbyid(id);
		}
		return dr;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<Integer> update(@RequestBody BQ_Costormer bq_Costormer) {
		DataResult<Integer> dr = demoFeignService.update(bq_Costormer);
		return dr;
	}
	
	
}
