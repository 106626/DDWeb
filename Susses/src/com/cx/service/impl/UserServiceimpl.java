package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IUserDao;
import com.cx.dao.impl.UserDaoimpl;
import com.cx.entity.User;
import com.cx.service.IUserService;

public class UserServiceimpl implements IUserService{
	
	IUserDao dao=new UserDaoimpl();
	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		dao.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO 自动生成的方法存根
		return dao.findAll();
	}

	@Override
	public List<User> findAll(String uName, String uPassword) {
		// TODO 自动生成的方法存根
		return dao.findAll(uName, uPassword);
	}

}
