package com.cx.dao;

import java.util.List;

import com.cx.entity.UserAddress;

public interface IUserAddressDao {
	
	List<UserAddress> findAll();
	
	void delById(Integer id);
}
