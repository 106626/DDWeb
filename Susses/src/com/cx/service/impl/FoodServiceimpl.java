package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IFoodDao;
import com.cx.dao.impl.FoodDaoimpl;
import com.cx.entity.Food;
import com.cx.service.IFoodService;

public class FoodServiceimpl implements IFoodService{
	
	IFoodDao foodDao = new FoodDaoimpl();
	
	@Override
	public List<Food> findAll() {
		// TODO 自动生成的方法存根
		return foodDao.findAll();
	}

	@Override
	public void save(Food food) {
		// TODO 自动生成的方法存根
		foodDao.save(food);
	}

	@Override
	public void delById(Integer fId) {
		// TODO 自动生成的方法存根
		foodDao.delById(fId);
	}

}
