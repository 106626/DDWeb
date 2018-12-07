package com.cx.dao;

import java.util.List;

import org.junit.Test;

import com.cx.dao.impl.AdmiDaoimpl;
import com.cx.entity.Admi;

public class TestAdmiDao {
	
	IAdmiDao dao=new AdmiDaoimpl();
	
	@Test
	public void TestfindAll(){
		
		List<Admi> list = dao.findAll();
		//System.out.println(list);
		
		for (Admi s : list) {
			
			System.out.println(s);
		}
	}
	
	@Test
	public void TestSave(){
		Admi s = new Admi();
		//设置初始值
		//s.setId(8);
		s.setAdmiID(11);
		
		s.setAdmiName("ssss");
		
		s.setAdmiPassword("122546");
		
		dao.save(s);
		
	}
}