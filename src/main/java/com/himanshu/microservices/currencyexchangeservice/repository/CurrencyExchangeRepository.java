package com.himanshu.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.microservices.currencyexchangeservice.objects.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	CurrencyExchange findByFromAndTo(String from, String to);

}
