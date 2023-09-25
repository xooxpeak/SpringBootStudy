package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.dao.DeptDAO;
import com.exam.dto.DeptDTO;

@Service("xxx")
public class DeptServiceImpl implements DeptService {
	
	//DAO 주입받기
	//생성자로 주입받기 => 기본 생성자 제거 필수
	
	DeptDAO dao;

	public DeptServiceImpl(DeptDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<DeptDTO> deptList() {
		return dao.deptList();
	}
	
	
	

}
