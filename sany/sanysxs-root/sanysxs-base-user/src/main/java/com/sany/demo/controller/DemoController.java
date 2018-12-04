package com.sany.demo.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @ClassName: DemoController
 * @Description: demo
 * @Author yuqun
 * @DateTime 2018年11月12日 下午2:45:08
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@ApiOperation(value = "模拟登陆测试", notes = "模拟登陆测试信息")
	@RequestMapping(value = "login", method = RequestMethod.GET , produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<BQ_Costormer> login(HttpServletRequest request, HttpServletResponse response) {
		DataResult<BQ_Costormer> dr;
		BQ_Costormer bq = new BQ_Costormer();
		bq.setId("1");
		dr = DataResult.success(bq);
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
	@ApiOperation(value = "测试依据ID查询", notes = "测试依据ID查询记录")
	@ApiImplicitParam(name = "id", value = "数据记录id", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "demoFindById/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<BQ_Costormer> demoFindById(@PathVariable String id) {
		DataResult<BQ_Costormer> dr;
		if (null == id) {
			dr = DataResult.failure(ErrorType.PARAM_ERROR);
		} else {
			dr = DataResult.success(demoService.demofindbyid(id));
		}
		return dr;
	}
	@ApiOperation(value = "分页查询", notes = "分页查询方法")
	@ApiImplicitParams({
	@ApiImplicitParam(name = "id", value = "数据id", required = true, dataType = "String", paramType = "path"),
	@ApiImplicitParam(name = "pageRequest", value = "分页查询条件", required = true, dataType = "PageRequest", paramType = "body") })
	@RequestMapping(value = "findPage/{id}", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<PageInfo<BQ_Costormer>> findPage(@PathVariable String id, @RequestBody PageRequest<BQ_Costormer> pageRequest) {
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
	@RequestMapping(value = "update", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	@Cacheable(value = "default")
	public DataResult<Integer> update(@RequestBody BQ_Costormer bq_Costormer) {
		DataResult<Integer> dr = DataResult.success(demoService.update(bq_Costormer));
		return dr;
	}
}
