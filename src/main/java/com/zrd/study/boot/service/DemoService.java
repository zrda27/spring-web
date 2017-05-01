package com.zrd.study.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.zrd.study.boot.dao.IDemoDAO;
import com.zrd.study.boot.dto.DemoDTO;

@Service
public class DemoService implements IDemoService {
	@Autowired
	private IDemoDAO demoDao;
	@Value("${demo.name}")
	private String demoName;
	@Autowired
	private DemoDTO demoDto;
	
	@Override
	public String getU(String u) {
		return demoDao.getU(u + this.demoName + demoDto.getAge());
	}

}
