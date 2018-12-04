package com.sany.demo.controller;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.github.pagehelper.PageInfo;
import com.sany.common.DataResult;
import com.sany.common.PageRequest;
import com.sany.common.web.CookieUtils;
import com.sany.demo.service.DemoService;
import com.sany.entity.BQ_Costormer;
import com.sany.enums.ErrorType;

/**
 * 
 * @ClassName: DemoController
 * @Description: 
 * @Author yuqun
 * @DateTime 2018年11月12日 下午2:45:08
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value = "login", produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<BQ_Costormer> login(HttpServletRequest request, HttpServletResponse response) {
		DataResult<BQ_Costormer> dr;
		BQ_Costormer bq = new BQ_Costormer();
		bq.setId("aaaaaaaaa");
		String strcok3 = request.getHeader("token");
		System.err.println("headerusertoken--------"+strcok3);
		dr = DataResult.success(bq);
		dr.setCode(1);
		return dr;
	}
	
	/**
	 * @Title: test
	 * @Description: 
	 * @Author yuqun
	 * @DateTime 2018年11月12日 下午2:43:56
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "demoHrFindById/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<BQ_Costormer> demoHrFindById(@PathVariable String id) {
		System.out.println("testService"+demoService);
		DataResult<BQ_Costormer> dr;
		if (null == id) {
			dr = DataResult.failure(ErrorType.PARAM_ERROR);
		} else {
			dr = DataResult.success(demoService.demofindbyid(id));
		}
		return dr;
	}
	
	@RequestMapping(value = "findhrPage/{id}", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<PageInfo<BQ_Costormer>> findPage(@PathVariable Long id, @RequestBody PageRequest<BQ_Costormer> pageRequest) {
		DataResult<PageInfo<BQ_Costormer>> dr = DataResult.success(demoService.findPage(id,pageRequest));
		return dr;
	}
	
	/**
	 * @RequestMapping(value="/addUser",
			method=RequestMethod.POST,
			consumes="application/x-www-form-urlencoded")
	 * @Title: update
	 * @Description: 
	 * @Author Quentin
	 * @DateTime 2018年11月12日 下午6:58:54
	 * @param bq_Costormer
	 * @return
	 */
	@RequestMapping(value = "updatehr", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<Integer> update(@RequestBody BQ_Costormer bq_Costormer) {
		DataResult<Integer> dr = DataResult.success(demoService.update(bq_Costormer));
		return dr;
	}
}
