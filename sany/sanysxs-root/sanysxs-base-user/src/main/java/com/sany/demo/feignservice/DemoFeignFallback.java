package com.sany.demo.feignservice;

import org.springframework.stereotype.Component;

import com.sany.common.DataResult;
import com.sany.entity.BQ_Costormer;

/**
 * @ClassName: DemoFeignService
 * @Description: Feign调用demo
 * @Author yuqun
 * @DateTime 2018年11月13日 上午8:59:03
 */
@Component
public class DemoFeignFallback implements DemoFeignService {

	@Override
	public DataResult demofindbyid(String id) {
		System.out.println("调用失败了");
		return null;
	}

	@Override
	public DataResult update(BQ_Costormer bq_Costormer) {
		System.out.println("调用失败了");
		return null;
	}

}
