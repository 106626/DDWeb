package com.cx.dao;

import java.util.List;

import com.cx.entity.Order;
import com.cx.entity.OrderInfo;

public interface IOrderDao {
	
	List<OrderInfo> findAll(String fName,String mName,String uName);
	
	void delById(Integer ordId);
}
