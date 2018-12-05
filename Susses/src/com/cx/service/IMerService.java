package com.cx.service;

import java.util.List;

import com.cx.entity.Mer;

public interface IMerService {
	List<Mer> findAll(String mName,Integer mA_id);
	
	void save(Mer mer);
}
