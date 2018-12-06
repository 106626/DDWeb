package com.cx.service;

import java.util.List;

import com.cx.entity.Mer;

public interface IMerService {

	void save(Mer mer);
	
	List<Mer> findAll(String mName);
}
