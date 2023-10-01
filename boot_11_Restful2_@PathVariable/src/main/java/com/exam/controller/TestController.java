package com.exam.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dto.DeptDTO;

@RestController
public class TestController {
	
	// 요청URL : http://localhost:8090/app/board/num/10
	// 요청URL : http://localhost:8090/app/board/10
	// 10을 가지고 select => num이라는 변수에 10이 저장된 것
	@GetMapping("/board/{num}")
	public String aaa(@PathVariable("num") String num) {    //"num"에 저장되어 있는 값을 가져와서 num에 저장
		//조회작업
		System.out.println("@GetMapping-조회용" + num);
		return "get";
	}
	
	
	
	// 요청URL : http://localhost:8090/app/board2/num/10/name/hong
	// 요청URL : http://localhost:8090/app/board2/10/hong 
	// 요청URL : http://localhost:8090/app/board2/20/kim => num값은 20, username값 kim 이용해서 POST(insert)할 의도임.
	// num값은 10, name값은 hong
	// @PostMapping("/board2/num변수/이름변수")
	@PostMapping("/board2/{num}/{username}")
	public String bbb(@PathVariable("num") String num, @PathVariable("username") String username) {
		//저장작업
		System.out.println("@PostMapping-저장용" + num + "\t" + username);
		return "post";
	}
	
	
	
	
	// 요청URL : http://localhost:8090/app/board2/20/kim => num값 20 username값 kim 이용해서 PUT(update) 할 의도임.
	@PutMapping("/board2/{num}/{username}")
	public String ccc(@PathVariable("num") String num, @PathVariable("username") String username) {
		//수정작업
		System.out.println("@PutMapping-수정용" + num + "\t" + username);
		return "put";
	}
	
	
	
	// 요청URL : http://localhost:8090/app/board/10 => num값 10 이용해서 DELETE(delete) 할 의도임.
	@DeleteMapping("/board/{num}")
	public String ddd(@PathVariable("num") String num) {
		//삭제작업
		System.out.println("@DeleteMapping-삭제용" + num);
		return "delete";
	}

}
