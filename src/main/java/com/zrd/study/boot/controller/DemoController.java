package com.zrd.study.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zrd.study.boot.service.IDemoService;

@RestController
public class DemoController {
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("/")
	String index(){
		return demoService.getU("哈哈哈");
	}
}
