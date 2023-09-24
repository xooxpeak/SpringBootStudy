package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.exam.service.UserService;

@SpringBootApplication
@EnableAspectJAutoProxy    //AOP 활성화
public class Application {

	public static void main(String[] args) {
		
		System.out.println("Boot실행");
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	
		UserService service = ctx.getBean("xxx", UserService.class);
		System.out.println(service.sayEcho());
	}

}
