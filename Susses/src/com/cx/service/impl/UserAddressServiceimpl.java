package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IUserAddress;
import com.cx.dao.impl.UserAddressimpl;
import com.cx.entity.UserAddress;

public class UserAddressServiceimpl implements IUserAddress{
	
	IUserAddress userAddress = new UserAddressimpl();
	
	@Override
	public List<UserAddress> findAll() {
		// TODO 自动生成的方法存根
		return userAddress.findAll();
	}

	@Override
	public void save(UserAddress useraddress) {
		// TODO 自动生成的方法存根
		userAddress.save(useraddress);
	}

}
