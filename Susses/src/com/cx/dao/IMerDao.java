package com.cx.dao;

import java.util.List;

import com.cx.entity.Mer;

public interface IMerDao {

	void save(Mer mer);
	
	List<Mer> findAll(String mName);
}
