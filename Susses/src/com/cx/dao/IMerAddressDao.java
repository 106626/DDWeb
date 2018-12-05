package com.cx.dao;

import java.util.List;

import com.cx.entity.MerAddress;

public interface IMerAddressDao {
	
	List<MerAddress> findAll();
	
	void delById(Integer id);
}
