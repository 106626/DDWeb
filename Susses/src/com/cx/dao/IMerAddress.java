package com.cx.dao;

import java.util.List;

import com.cx.entity.MerAddress;

public interface IMerAddress {
	
	List<MerAddress> findAll();
	
	void save(MerAddress meraddress);
}
