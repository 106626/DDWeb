package com.cx.dao;

import java.util.List;

import org.junit.Test;

import com.cx.dao.impl.OrderDaoimpl;
import com.cx.entity.OrderInfo;

public class TestOrder {
	IOrderDao dao=new OrderDaoimpl();
	
	@Test
	public void TestfindAll(){
		List<OrderInfo> list=dao.findAll(null, null, null);
		for(OrderInfo s:list){
			System.out.println(s);
		}
	}
	@Test
	public void TestDelById(){
		dao.delById(4);
	}
}
