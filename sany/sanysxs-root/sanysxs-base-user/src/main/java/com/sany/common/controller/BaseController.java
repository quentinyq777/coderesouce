/*package com.sany.common.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.sany.common.DataResult;
import com.sany.common.mapper.JsonMapper;
import com.sany.enums.ErrorType;

@ControllerAdvice
@RestController
public class BaseController {
	private Logger logger = LoggerFactory.getLogger(BaseController.class);

	@ModelAttribute
	public void printParams(HttpServletRequest request) {
		// 请求url
		String requestPath = request.getRequestURI();
		// 请求参数
		Map<?, ?> inputParamMap = request.getParameterMap();
		String res = null;
		try {
			request.setCharacterEncoding("UTF-8");
			int size = request.getContentLength();
			InputStream is = request.getInputStream();
			byte[] reqBodyBytes = readBytes(is, size);
			res = new String(reqBodyBytes);
		} catch (Exception e) {
		}

		logger.info(MessageFormat.format("{0}({1})({2}) at {3,date,yyyy-MM-dd HH:mm:ss}", requestPath,
				JsonMapper.toJson(inputParamMap) , res, new Date()));
	}

	private byte[] readBytes(InputStream is, int contentLen) {
		if (contentLen > 0) {
			int readLen = 0;
			int readLengthThisTime = 0;
			byte[] message = new byte[contentLen];
			try {
				while (readLen != contentLen) {
					readLengthThisTime = is.read(message, readLen, contentLen - readLen);
					if (readLengthThisTime == -1) {// Should not happen.
						break;
					}
					readLen += readLengthThisTime;
				}
				return message;
			} catch (IOException e) {
				// Ignore
				// e.printStackTrace();
			}
		}
		return new byte[] {};
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@ExceptionHandler
	public DataResult<Object> handleException(HttpServletRequest request, HttpServletResponse response, Exception e) {
		// 请求url
		String requestPath = request.getRequestURI();
		// 请求参数
		Map<?, ?> inputParamMap = request.getParameterMap();
		String res = null;
		try {
			request.setCharacterEncoding("UTF-8");
			int size = request.getContentLength();
			InputStream is = request.getInputStream();
			byte[] reqBodyBytes = readBytes(is, size);
			res = new String(reqBodyBytes);
		} catch (Exception e1) {
		}
		//
		DataResult ri = null;
		if(e instanceof SQLException) {
			 ri = DataResult.failure(ErrorType.DB_ERROR);
		}else {
			 ri = DataResult.failure(ErrorType.SYS_ERROR);
		}
		StringWriter sw = null;
		PrintWriter pw = null;
		try {
			sw = new StringWriter();
			pw = new PrintWriter(sw);
			// 将出错的栈信息输出到printWriter中
			e.printStackTrace(pw);
			pw.flush();
			sw.flush();
		} finally {
			if (sw != null) {
				try {
					sw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (pw != null) {
				pw.close();
			}
		}
		logger.error(MessageFormat.format("{0}({1})({2}) at {3,date,yyyy-MM-dd HH:mm:ss} Exception:{4}", requestPath,
				JsonMapper.toJson(inputParamMap),res, new Date(), sw.toString()));
		return ri;
	}
}
*/