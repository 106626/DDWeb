package com.cx.dao;

import java.util.List;

import com.cx.entity.Food;

public interface IFoodDao {
	
	List<Food> findAll(String fName,Integer fT_id);
	
	void delById(Integer id);
}
