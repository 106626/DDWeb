package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IUserDao;
import com.cx.dao.impl.UserDaoimpl;
import com.cx.entity.User;
import com.cx.service.IUserService;

public class UserServiceimpl implements IUserService{

	IUserDao userDao = new UserDaoimpl();
	
	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		userDao.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO 自动生成的方法存根
		return userDao.findAll();
	}

	@Override
	public void delById(Integer Id) {
		// TODO 自动生成的方法存根
		userDao.delById(Id);
	}

	@Override
	public List<User> findAll(String uName, Integer uAId) {
		// TODO 自动生成的方法存根
		return userDao.findAll(uName, uAId);
	}

}
