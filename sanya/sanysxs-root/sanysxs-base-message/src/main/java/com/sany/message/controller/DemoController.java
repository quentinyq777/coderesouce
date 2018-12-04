package com.sany.message.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sany.entity.BQ_Costormer;

@RestController
public class DemoController {
	@Autowired
    private JmsTemplate jmsTemplate;

    /**
     * 发送订阅
     */
	@RequestMapping(value = "sendDemo/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public BQ_Costormer send(@PathVariable String id) {
		BQ_Costormer bq = new BQ_Costormer();
		Date date = new Date();
		bq.setBank(""+date.getTime());
        jmsTemplate.convertAndSend("demo","sendDemo-" + id+"-"+date.getTime());
        return bq;
    }
	
	/**
     * 发送订阅
     */
	@RequestMapping(value = "sendDemo1/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public BQ_Costormer sendDemo1(@PathVariable String id) {
		BQ_Costormer bq = new BQ_Costormer();
		Date date = new Date();
		bq.setBank(""+date.getTime());
        jmsTemplate.convertAndSend("demo1","sendDemo1-"+ id+"-"+date.getTime());
        return bq;
    }
    
}
