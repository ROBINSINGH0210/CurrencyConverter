package com.currencyConvertor.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currencyConvertor.main.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
