package com.cx.dao;

import java.util.List;

import org.junit.Test;

import com.cx.dao.impl.UserDaoimpl;
import com.cx.entity.User;


public class TestUserDao {

	IUserDao dao = new UserDaoimpl();
	
	
	@Test
	public void testSave(){
		User s = new User();
//		s.setuId(8);
		
		s.setuPhone("123456");
		
		s.setuName("ssss");
		
		s.setuPassword("123544");
		
//		s.setSex('F');
//		
//		UserAddress area = new UserAddress();
//		
//		area.setuAId(2);
//		
//		s.setUseraddress(area);
//		
//		Vip vip=new Vip();
//		
//		vip.setvId(6);
//		
//		s.setVip(vip);

		dao.save(s);
	}
	
	@Test
	public void testFindAll(){
		List<User> list = dao.findAll();
		
		for (User user : list) {
			System.out.println(user);
		}
	}
	
}