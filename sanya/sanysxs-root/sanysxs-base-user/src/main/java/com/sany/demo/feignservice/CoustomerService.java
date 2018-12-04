package com.sany.demo.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sany.conf.FeignConfig;

@FeignClient(value = "sanysmart-hr",fallback=CoustomerFall.class,configuration = FeignConfig.class)
public interface CoustomerService {
	// 请求provider端服务 hi
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
