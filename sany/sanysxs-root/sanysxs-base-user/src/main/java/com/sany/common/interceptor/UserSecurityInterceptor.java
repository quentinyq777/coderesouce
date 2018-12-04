package com.sany.common.interceptor;


import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sany.common.annotation.NotLoginRequired;
import com.sany.common.mapper.JsonMapper;
import com.sany.common.web.ISession;
import com.sany.common.web.WebSession;



public class UserSecurityInterceptor implements HandlerInterceptor {
	Logger logger = LoggerFactory.getLogger(UserSecurityInterceptor.class);
	
	private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("StopWatch-StartTime");

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO redis 验证  
		/*ISession session = WebSession.getInstance();
		String url = request.getRequestURI();*/
		String token = request.getHeader("token");
		System.err.println("usertoken--------"+token);
		/*if (!(handler instanceof HandlerMethod)) {
			return true;
		}*/
		/*if (url.contains("/demo")) {
           return true;
        } else if (url.contains("/error")) {
        	return false;
        }*/
		// 在请求处理之前进行调用（Controller方法调用之前）
		// 当返回true，继续执行链；如果返回false，则停止后续的执行
		
		/*startTimeThreadLocal.set(System.currentTimeMillis());
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Method method = handlerMethod.getMethod();
		NotLoginRequired annotation = method.getAnnotation(NotLoginRequired.class);
		if (annotation != null) {
		   return true;
		}

		if (session.isExist()) {
			return true;
		}*/

		//response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）"
		// HandlerMethod handlerMethod =(HandlerMethod) handler;
		// MethodParameter[] parameter = handlerMethod.getMethodParameters();
		// for (MethodParameter p : parameter) {
		// System.out.println(p.getParameterName());
		// System.out.println(request.getParameter(p.getParameterName()));
		// System.out.println(request.getParameter(p.getParameterName()).toString());
		// }
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作
		// 结束时间
		/*long endTime = System.currentTimeMillis();
		
		long beginTime = startTimeThreadLocal.get();
		// 消耗的时间
		long consumeTime = endTime - beginTime;
		//请求url
		String requestPath = request.getRequestURI();
		//请求参数
		Map<?, ?> inputParamMap = request.getParameterMap();
		// 超过200毫秒写入日志
		if (consumeTime > 200) {
			logger.warn(MessageFormat.format("{0}({1}) at {2,date,yyyy-MM-dd HH:mm:ss} ex-{3}",requestPath,JsonMapper.toJson(inputParamMap),new Date(beginTime),ex));
		}*/
		//几毫秒访问一次，BUG
		/*else{
			logger.info(MessageFormat.format("{0}({1}) at {2,date,yyyy-MM-dd HH:mm:ss} ex-{3}",requestPath,JsonUtils.toJson(inputParamMap),new Date(beginTime),ex));
		}*/
	}
}
