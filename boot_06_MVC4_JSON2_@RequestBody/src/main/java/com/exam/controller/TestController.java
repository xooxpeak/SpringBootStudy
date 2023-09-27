package com.exam.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.dto.LoginDTO;

@Controller
public class TestController {
	// http://localhost:8090/app/main
	@GetMapping("/main")
	public String main() {
		return "main";   // /WEB-INF/views/main.jsp
	}

	@PostMapping("/yyy")
	@ResponseBody    //리턴되는 OK를 JSP로 처리안하고 그냥 리턴되는 데이터로 저장하기 위함
	public String yyy(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		return "OK";    //OK가 data로 넘어감
	}
	
	@PostMapping("/zzz")
	@ResponseBody    //리턴되는 OK를 JSP로 처리안하고 그냥 리턴되는 데이터로 저장하기 위함
	public String zzz(@RequestBody ArrayList<LoginDTO> list) {
		System.out.println(list);
		return "OK";    //OK가 data로 넘어감
	}
}
