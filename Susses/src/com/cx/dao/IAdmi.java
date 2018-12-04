package com.cx.dao;

import java.util.List;

import com.cx.entity.Admi;

public interface IAdmi {
	
	List<Admi> findAll();
	
	void save(Admi admi);
}
