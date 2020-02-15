package com.example.apigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.apigatewayzuul.pre.PreOperationService;

@Configuration
public class BeanConfig {
	
	@Bean
	public PreOperationService loggerService() {
		return new PreOperationService();
	}

}
