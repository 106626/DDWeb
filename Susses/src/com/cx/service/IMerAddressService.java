package com.cx.service;

import java.util.List;

import com.cx.entity.MerAddress;

public interface IMerAddressService {
	
	List<MerAddress> findAll();
	
	void save(MerAddress meraddress);
}
