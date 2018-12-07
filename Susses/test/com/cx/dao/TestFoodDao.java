package com.cx.dao;

import java.util.List;

import org.junit.Test;

import com.cx.dao.impl.FoodDaoimpl;
import com.cx.entity.Food;

public class TestFoodDao {
	IFoodDao dao=new FoodDaoimpl();
	
	@Test
	
	public void TestfindAll(){
		
		List<Food> list = dao.findAll("水", null);
		//System.out.println(list);
		
		for (Food s : list) {
			
			System.out.println(s);
		}
	}
}
