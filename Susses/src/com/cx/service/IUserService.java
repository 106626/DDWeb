package com.cx.service;

import java.util.List;

import com.cx.entity.User;

public interface IUserService {
	/*
	 * 保存一个用户的信息
	 * 
	 */
	
	void save(User user);
	
	//查询所有用户
	
	List<User> findAll();
	

	/*
	 * uAId-地址（外键）
	 */
	List<User> findAll(String uName,Integer uAId);
}
