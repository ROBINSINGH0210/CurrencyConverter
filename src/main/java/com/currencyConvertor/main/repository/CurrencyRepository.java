package com.currencyConvertor.main.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.currencyConvertor.main.model.CurrencyEntity;

@Transactional
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Long> {
	public List<CurrencyEntity> findTop10ByOrderByIdDesc();  
}