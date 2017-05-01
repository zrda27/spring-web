package com.zrd.study.boot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DemoDAO implements IDemoDAO {

	@Override
	public String getU(String u) {
		return "你好" + u;
	}

}
