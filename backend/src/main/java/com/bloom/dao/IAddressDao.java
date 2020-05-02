package com.bloom.dao;

import java.util.List;

import com.bloom.model.Address;

public interface IAddressDao {

	List<Address> getAddress(String keyword);

}
