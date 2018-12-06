package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IMerDao;
import com.cx.dao.impl.MerDaoimpl;
import com.cx.entity.Mer;
import com.cx.service.IMerService;

public class MerServiceimpl implements IMerService{
	IMerDao merDao = new MerDaoimpl();
	@Override
	public void save(Mer mer) {
		// TODO 自动生成的方法存根
		merDao.save(mer);
	}

	@Override
	public List<Mer> findAll(String mName) {
		// TODO 自动生成的方法存根
		return merDao.findAll(mName);
	}

}
