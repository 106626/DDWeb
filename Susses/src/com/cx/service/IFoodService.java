package com.cx.service;

import java.util.List;

import com.cx.entity.Food;

public interface IFoodService {
	List<Food> findAll(String fName,Integer fT_id);
	
	void delById(Integer id);
}
