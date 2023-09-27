package com.exam.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dto.DeptDTO;

@RestController    // @Controller + @ResponseBody
public class TestController {

	//String반환
	@GetMapping(value = "/aaa", produces = "text/plain;charset=utf-8")
	public String aaa() {
		return "홍길동";
	}
	
	//DeptDTO반환(JSON)
	@GetMapping(value = "/bbb")
	public DeptDTO bbb() {
		DeptDTO dto = new DeptDTO(10, "개발", "서울");
		return dto;
	}
	
	//List반환(JSON)
	@GetMapping(value = "/ccc")
	public ArrayList<DeptDTO> ccc() {
		ArrayList<DeptDTO> list = new  ArrayList<DeptDTO>();
		list.add(new DeptDTO(10, "개발1", "서울"));
		list.add(new DeptDTO(20, "개발2", "서울"));
		list.add(new DeptDTO(30, "개발3", "서울"));
		return list;
	}
	
	//html반환
	@GetMapping(value = "/ddd", produces = "text/html;charset=utf-8")
	public String ddd() {
		return "<html><body><h1>Hello</h1></body></html>";
	}
	
	//xml반환
	@GetMapping(value = "/eee", produces = "text/xml;charset=utf-8")
	public String eee() {
		return "<person><name>홍길동</name><age>20</age></person>";
	}
}
