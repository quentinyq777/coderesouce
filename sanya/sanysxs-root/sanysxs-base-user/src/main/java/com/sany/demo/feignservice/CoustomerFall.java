package com.sany.demo.feignservice;

import org.springframework.stereotype.Component;

@Component
public class CoustomerFall implements CoustomerService {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry " + name;
	}
}
