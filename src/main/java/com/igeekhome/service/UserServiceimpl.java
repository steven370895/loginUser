package com.igeekhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igeekhome.mapper.UserMapper;
import com.igeekhome.pojo.User;
@Service
public class UserServiceimpl implements UserService{
	@Autowired
	private UserMapper um;
	
	@Override
	public boolean register(User user) {
		 
		return um.insert(user)>0;
	}

	@Override
	public User login(String name, String pwd) {
		User user=new User( name, pwd);
	
		
		return um.select(user);
	}

}
