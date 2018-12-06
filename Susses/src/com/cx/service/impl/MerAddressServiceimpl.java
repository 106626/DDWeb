package com.cx.service.impl;

import java.util.List;

import com.cx.dao.IMerAddress;
import com.cx.dao.impl.MerAddressimpl;
import com.cx.entity.MerAddress;
import com.cx.service.IMerAddressService;

public class MerAddressServiceimpl implements IMerAddressService{
	
	IMerAddress merAddress = new MerAddressimpl();
	
	@Override
	public List<MerAddress> findAll() {
		// TODO 自动生成的方法存根
		return merAddress.findAll();
	}

	@Override
	public void save(MerAddress meraddress) {
		// TODO 自动生成的方法存根
		merAddress.save(meraddress);
	}

}
