package com.exam.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.dto.LoginDTO;

@Controller
public class TestController {
	
	/*
	 * 기존 SpringFramework의 application scope 사용 
	 * 1) implements ServletContextAware
	 * 2) @Override 
	 * public void setServletContext(ServletContext servletContext) {
	 * this.application = servletContext; }
	 */
	
	@Autowired
	ServletContext application;
	
	@GetMapping("/main")
	public String main() {
		return "main";  // src/main/resources/templates/main.html
	}

	@GetMapping("/main2")
	public String main2(Model m, HttpSession session) {
		m.addAttribute("username", "홍길동");
		session.setAttribute("username", "홍길동2");
		return "main2";  // src/main/resources/templates/main.html
	}
	
	@GetMapping("/main3")
	public String main3(Model m) {
		m.addAttribute("login", new LoginDTO("aaa", "1234"));
		return "main3";  // src/main/resources/templates/main.html
	}
	
	@GetMapping("/main4")
	public String main4(Model m) {
		m.addAttribute("login", new LoginDTO("aaa", "1234"));
		m.addAttribute("login2", new LoginDTO("aaa", "1234"));
		
		List<LoginDTO> list =
				Arrays.asList(new LoginDTO("aaa1", "1234"),
						new LoginDTO("aaa2", "345"),
						new LoginDTO("aaa3", "5422"));
		
		m.addAttribute("loginList", list);
		return "main4";  // src/main/resources/templates/main.html
	}
	
	@GetMapping("/main5")
	public String main5(Model m) {
		m.addAttribute("login", new LoginDTO("aaa", "1234"));
		return "main5";  
	}
	
	@GetMapping("/main5_1")
	public String main5_1(@RequestParam("id") String id, @RequestParam("age") String age) {
		System.out.println(id+" "+age);
		return "main5";  
	}
	

	@GetMapping("/main6")
	public String main6() {
		return "main6";  
	}
	
	
}
