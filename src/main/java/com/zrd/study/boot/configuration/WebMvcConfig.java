package com.zrd.study.boot.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zrd.study.boot.filter.DemoFilter;
import com.zrd.study.boot.listener.DemoListener;
import com.zrd.study.boot.servlet.DemoServlet;

@Configuration
@ConditionalOnWebApplication
@EnableCaching  //开启缓存
public class WebMvcConfig {
	@Bean
	public ServletRegistrationBean demoServlet(){
		return new ServletRegistrationBean(new DemoServlet(), "/demoServlet");
	}
	
	@Bean
	public FilterRegistrationBean demoFilter(){
		FilterRegistrationBean bean = new FilterRegistrationBean(new DemoFilter());
		bean.addUrlPatterns("/*");
		bean.setOrder(2);
		return bean;
	}
	
	@Bean
	public ServletListenerRegistrationBean<DemoListener> demoListener(){
		return new ServletListenerRegistrationBean<DemoListener>(new DemoListener());
	}
}
