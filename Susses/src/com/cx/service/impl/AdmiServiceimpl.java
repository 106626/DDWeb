package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IAdmiDao;
import com.cx.dao.impl.AdmiDaoimpl;
import com.cx.entity.Admi;
import com.cx.service.IAdmiService;

public class AdmiServiceimpl implements IAdmiService{
	IAdmiDao dao=new AdmiDaoimpl();
	@Override
	public List<Admi> findAll() {
		// TODO 自动生成的方法存根
		return dao.findAll();
	}

	@Override
	public void save(Admi admi) {
		// TODO 自动生成的方法存根
		dao.save(admi);
	}

}
