package com.currencyConvertor.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.currencyConvertor.main.model.User;
import com.currencyConvertor.main.repository.UserRepository;

@Repository
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional
	@Override
	public void save(User user) {
		user.setPassword(user.getPassword());
		userRepository.save(user);
	}

	@Transactional
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
