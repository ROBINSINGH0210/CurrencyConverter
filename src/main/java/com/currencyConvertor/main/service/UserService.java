package com.currencyConvertor.main.service;

import java.util.List;

import com.currencyConvertor.json.CurrencyJSON;
import com.currencyConvertor.main.model.User;

public interface UserService {
    void save(User user);

    User findByEmail(String username);
    
    String saveCurrencyDetails(CurrencyJSON currencyJSON);
    
    List<CurrencyJSON> getPreviousDetails();
}
