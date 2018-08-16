package com.currencyConvertor.main.service;

import com.currencyConvertor.main.model.User;

public interface UserService {
    void save(User user);

    User findByEmail(String username);
}
