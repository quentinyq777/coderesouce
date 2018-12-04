package com.sany.demo.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sany.common.DataResult;
import com.sany.conf.FeignConfig;
import com.sany.entity.BQ_Costormer;
/**
 * @ClassName: DemoFeignService
 * @Description: Feign调用demo
 * @Author yuqun
 * @DateTime 2018年11月13日 上午8:59:03
 */
@FeignClient(value = "sanysxs-bussiness-hrpro", fallback = DemoFeignFallback.class, configuration = FeignConfig.class)
public interface DemoFeignService {
	
	@RequestMapping(value = "/demo/demoHrFindById/{id}", method = RequestMethod.GET)
	public DataResult demofindbyid(@PathVariable("id") String id);
	
	@RequestMapping(value = "/demo/updatehr", method = RequestMethod.POST)
	public DataResult update(@RequestBody BQ_Costormer bq_Costormer);
}
