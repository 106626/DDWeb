package com.cx.service;

import java.util.List;

import com.cx.entity.OrderInfo;

public interface IOrderService {
	List<OrderInfo> findAll(String fName,String mName,String uName);
	
	void delById(Integer ordId);
}