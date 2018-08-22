package com.currencyConvertor.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.currencyConvertor.main.model.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

