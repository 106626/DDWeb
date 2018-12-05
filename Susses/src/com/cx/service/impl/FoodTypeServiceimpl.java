package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IFoodTypeDao;
import com.cx.dao.impl.FoodTypeDaoimpl;
import com.cx.entity.FoodType;
import com.cx.service.IFoodTypeService;

public class FoodTypeServiceimpl implements IFoodTypeService{
	IFoodTypeDao dao=new FoodTypeDaoimpl();
	@Override
	public List<FoodType> findAll() {
		// TODO 自动生成的方法存根
		return dao.findAll();
	}

	@Override
	public void delById(Integer id) {
		// TODO 自动生成的方法存根
		dao.delById(id);
	}

}
