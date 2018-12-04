package com.cx.dao;

import java.util.List;

import com.cx.entity.Area;

public interface IAreaDao {
	List<Area> findAll();
	
	void save(Area area);
}
