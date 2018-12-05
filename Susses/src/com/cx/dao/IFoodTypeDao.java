package com.cx.dao;

import java.util.List;

import com.cx.entity.FoodType;

public interface IFoodTypeDao {
	
	List<FoodType> findAll();
	
	void delById(Integer id);
}
