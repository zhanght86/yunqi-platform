package com.yunqi.apis.org.config;

import org.springframework.context.annotation.Configuration;

import com.earven.asyncall.AsyncallConfig;
import com.earven.asyncall.service.Module;

@Configuration
public class AsynApiConfig extends AsyncallConfig{

	@Override
	public Module getModule() {
		return Module.ORG;
	}
	
}
