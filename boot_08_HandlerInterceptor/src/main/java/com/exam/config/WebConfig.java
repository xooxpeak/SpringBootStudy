package com.exam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.exam.interceptor.MyHandlerInterceptor;

@Configuration  //servlet 
public class WebConfig implements WebMvcConfigurer {


/* 
  <mvc:interceptors>		 
	<mvc:interceptor>		   
		<mvc:mapping path="/loginCheck/*"/>		    
			<ref bean="xxx"/>		 
 </mvc:interceptor>
 
 */
	@Autowired
	MyHandlerInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)
		        .addPathPatterns("/login", "/mypage");
	}
	
	/*
	  <mvc:view-controller path="/mypage" view-name="main"/>
	*/
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/mypage")	
		        .setViewName("main");
	}
 
	
	
	
 
}
