package com.cx.service;

import java.util.List;

import com.cx.entity.Admi;

public interface IAdmiService {
	List<Admi> findAll();
	
	void save(Admi admi);
}
