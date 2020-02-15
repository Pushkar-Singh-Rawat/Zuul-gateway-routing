package com.example.apigatewayzuul.pre;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreOperationService extends ZuulFilter {
	Logger logger = LoggerFactory.getLogger(PreOperationService.class);

	@Override
	public boolean shouldFilter() {

		return true;
	}

	@Override
	public Object run() throws ZuulException {
        
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info(request.toString());
		logger.info("request url:"+request.getRequestURI());
		
		return request.getRequestURI();
	}

	@Override
	public String filterType() {

		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
