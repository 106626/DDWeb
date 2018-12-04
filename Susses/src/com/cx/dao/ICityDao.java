package com.cx.dao;

import java.util.List;

import com.cx.entity.City;

public interface ICityDao {
	List<City> findAll();
	
	void save(City city);
	
}
