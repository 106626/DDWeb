package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IFoodDao;
import com.cx.dao.impl.FoodDaoimpl;
import com.cx.entity.Food;
import com.cx.service.IFoodService;

public class FoodServiceimpl implements IFoodService{
	IFoodDao dao=new FoodDaoimpl();
	@Override
	public List<Food> findAll(String fName, Integer fT_id) {
		// TODO 自动生成的方法存根
		return dao.findAll(fName, fT_id);
	}

	@Override
	public void delById(Integer id) {
		// TODO 自动生成的方法存根
		dao.delById(id);
	}

}
