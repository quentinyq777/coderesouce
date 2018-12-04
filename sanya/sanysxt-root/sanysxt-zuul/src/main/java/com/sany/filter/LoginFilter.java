package com.sany.filter;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.sany.common.lang.StringUtils;
import com.sany.common.mapper.JsonMapper;

import cn.hutool.json.JSON;
/**
 * 增加过滤器，token需要有值传参
 * @author yuqun
 *
 */
@Component
public class LoginFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(LoginFilter.class);

    @Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getHeader("token");
        System.err.println("token--------"+token+"");
        if (!StringUtils.isEmpty(token)) {
            //这里可以进一步校验token的合法性、时效性，甚至对报文进行校验
        	ctx.addZuulRequestHeader("token",token);
        	ctx.setSendZuulResponse(true); //将请求往后转发
        	ctx.setResponseStatusCode(200);
        }  else if (request.getRequestURI().contains("/login.html")) {
        	ctx.setSendZuulResponse(true); //将请求往后转发
        	ctx.setResponseStatusCode(200);
        } else if (request.getRequestURI().contains("/v2/api-docs")) {
        	ctx.setSendZuulResponse(true); //将请求往后转发
        	ctx.setResponseStatusCode(200);
        } else if (request.getRequestURI().contains("/hystrix.stream")) {
        	ctx.setSendZuulResponse(true); //将请求往后转发
        	ctx.setResponseStatusCode(200);
        } else {
            HttpServletResponse response = ctx.getResponse();
            response.setHeader("Content-Type", "application/json;charset=UTF-8");
            ctx.setSendZuulResponse(false); //终止转发，返回响应报文
            ctx.setResponseStatusCode(400);
            Map<String,String> responseMap=new HashMap<String,String>();
            responseMap.put("errorcode", "400");
            responseMap.put("errormsg", "请求被拦截");
            ctx.setResponseBody(JsonMapper.toJson(responseMap));
        }
        /*Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (Exception e){}
 
            return null;
        }*/
        return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
