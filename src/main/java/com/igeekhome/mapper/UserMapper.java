package com.igeekhome.mapper;

import com.igeekhome.pojo.User;

public interface UserMapper {
	/**
	 * 注册
	 * @return
	 */
	public int insert(User user);
	
	/**
	 * 查询
	 * @return
	 */
	public User select(User user);
}
