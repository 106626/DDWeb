package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IMerDao;
import com.cx.dao.impl.MerDaoimpl;
import com.cx.entity.Mer;
import com.cx.service.IMerService;

public class MerServiceimpl implements IMerService{
	IMerDao dao=new MerDaoimpl();
	@Override
	public List<Mer> findAll(String mName, Integer mA_id) {
		// TODO 自动生成的方法存根
		return dao.findAll(mName, mA_id);
	}

	@Override
	public void save(Mer mer) {
		// TODO 自动生成的方法存根
		dao.save(mer);
	}

}
