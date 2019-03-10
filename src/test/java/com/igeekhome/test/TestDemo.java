package com.igeekhome.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igeekhome.pojo.User;
import com.igeekhome.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class TestDemo {
	
	@Autowired
	private UserService us;
	@Test
	public void Test01() {
		User login = us.login("jiwei", "123");
		System.out.println(login);
	}
	
	
}
