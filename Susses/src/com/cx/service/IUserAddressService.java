package com.cx.service;

import java.util.List;

import com.cx.entity.UserAddress;

public interface IUserAddressService {
List<UserAddress> findAll();
	
	void delById(Integer id);
}
