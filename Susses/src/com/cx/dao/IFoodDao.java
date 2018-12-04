package com.cx.dao;

import java.util.List;

import com.cx.entity.Food;

public interface IFoodDao {
	
	List<Food> findAll();
	
	void save(Food food);
	
	void delById(Integer fId);
}
