package com.cx.dao;

import java.util.List;

import com.cx.entity.Mer;

public interface IMer {
	
	List<Mer> findAll();
	
	void save(Mer mer);
	
}
