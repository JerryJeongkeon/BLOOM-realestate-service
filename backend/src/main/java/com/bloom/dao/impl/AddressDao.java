package com.bloom.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bloom.dao.IAddressDao;
import com.bloom.model.Address;

@Repository
public class AddressDao implements IAddressDao {

	private String ns = "address.";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Address> getAddress(String keyword) {
		return sqlSession.selectList(ns + "getAddress", keyword);
	}

}
