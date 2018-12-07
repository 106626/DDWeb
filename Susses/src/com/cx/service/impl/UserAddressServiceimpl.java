package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IUserAddressDao;
import com.cx.dao.impl.UserAddressimpl;
import com.cx.entity.UserAddress;
import com.cx.service.IUserAddressService;

public class UserAddressServiceimpl implements IUserAddressService{
	IUserAddressDao dao=new UserAddressimpl();
	@Override
	public List<UserAddress> findAll() {
		// TODO 自动生成的方法存根
		return dao.findAll();
	}

	@Override
	public void delById(Integer id) {
		// TODO 自动生成的方法存根
		dao.delById(id);
	}

}
