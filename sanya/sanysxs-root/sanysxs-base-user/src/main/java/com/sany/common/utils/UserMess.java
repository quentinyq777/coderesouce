package com.sany.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sany.entity.BQ_Costormer;
import com.sany.repository.BQ_CostormerMapper;

public class UserMess {
    private static UserMess userMess = null;
    private String userName;   //  用户姓名
    public  String userCode;   //  用户编号
    public  String depCode;    //  部门编号
    public  String depName;    //  部门名称
    public  String rolecode;   //  权限代码
    
    public static UserMess getTrainUserMess() {
    	userMess = new UserMess();
    	return userMess;
    } 
    
    public UserMess() {
    	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
    	System.err.println("UserMess-----"+request.getHeader("token"));
    }
    
	
}
