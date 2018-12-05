package com.cx.service;

import java.util.List;

import com.cx.entity.FoodType;

public interface IFoodTypeService {
	List<FoodType> findAll();
	
	void delById(Integer id);
}
