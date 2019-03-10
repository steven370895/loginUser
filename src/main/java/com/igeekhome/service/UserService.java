package com.igeekhome.service;

import com.igeekhome.pojo.User;

public interface UserService {
	public boolean register(User user);
	
	public User login(String name,String pwd);
}
