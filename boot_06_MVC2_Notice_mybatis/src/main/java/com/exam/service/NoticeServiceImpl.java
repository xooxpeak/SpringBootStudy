package com.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.NoticeDAO;
import com.exam.dto.Notice;
import com.exam.dto.PageDTO;


@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeDAO dao;


	
	@Override
	public PageDTO selectList(int curPage) {
		return dao.selectList(curPage);
	}

	@Override
	public Notice selectByNo(int no) {
		return dao.selectByNo(no);
	}

	@Override
	public int noticeWrite(Notice notice) {
		return dao.noticeWrite(notice);
	}

	@Override
	public int noticeUpdate(Notice notice) {
		return dao.noticeUpdate(notice);
	}

	@Override
	public int noticeDelete(int no) {
		return dao.noticeDelete(no);
	}

}
