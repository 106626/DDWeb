package com.cx.dao;

import java.util.List;

import com.cx.entity.Province;

public interface IProvinceDao {
	
	List<Province> findAll();
	
	void save(Province province);
	
	
}
