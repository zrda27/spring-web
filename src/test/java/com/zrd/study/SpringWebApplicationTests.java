package com.zrd.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zrd.study.boot.dao.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringWebApplicationTests {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testUserRepository(){
		System.out.println(userRepository.count());
		System.out.println(userRepository.getByName("zrd"));
		System.out.println(userRepository.findByNameLike("zrd"));
		System.out.println(userRepository.withIdAndNameQuery(1, "zrd"));
		System.out.println(userRepository.findAll(new PageRequest(0, 2)).getSize());
	}

}
