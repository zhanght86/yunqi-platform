package com.yunqi.rest.service;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.yunqi.rest.dto.ExceptionDto;

public abstract class BaseController {  
	
	public final Logger logger = LoggerFactory.getLogger(getClass());
	
    @ExceptionHandler  
    public ExceptionDto exception(HttpServletRequest request, Exception ex) {
    	logger.debug(ex.getMessage());
    	ExceptionDto ed = new ExceptionDto();
    	ed.setMsg(ex.getMessage());
    	
    	if(ex instanceof ApiException){
    		Integer code = ((ApiException) ex).getCode();
    		ed.setCode(getApiCode() + code);
    	} else {
    		ed.setCode(-1);
    	}
 
		return ed;
    } 
	
    public abstract Integer getApiCode();
    
} 