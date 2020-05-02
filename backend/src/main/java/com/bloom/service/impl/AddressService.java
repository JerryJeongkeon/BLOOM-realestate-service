package com.bloom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloom.dao.IAddressDao;
import com.bloom.model.Address;
import com.bloom.service.IAddressService;

@Service
public class AddressService implements IAddressService {

	@Autowired
	private IAddressDao addressDao;

	@Override
	public List<Address> getAddress(String keyword) {
		return addressDao.getAddress(keyword);
	}

}
