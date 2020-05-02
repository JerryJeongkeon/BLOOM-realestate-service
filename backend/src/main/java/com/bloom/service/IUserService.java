package com.bloom.service;

import org.springframework.transaction.annotation.Transactional;

import com.bloom.model.Agent;
import com.bloom.model.User;

import java.util.List;

public interface IUserService {
	List<User> getAllUser();

	User getUserByNum(long num);

	@Transactional
	int createUser(User user);

	@Transactional
	int updateEntered(User user);

	@Transactional
	int obtainAuth(long num);

	@Transactional
	int updateUser(User user);

	@Transactional
	int loseAuth(long num);

}
