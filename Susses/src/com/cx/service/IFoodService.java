package com.cx.service;

import java.util.List;

import com.cx.entity.Food;

public interface IFoodService {
	
	List<Food> findAll();
	
	void save(Food food);
	
	void delById(Integer fId);
}
