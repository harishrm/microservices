package com.eduspring.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduspring.microservices.entity.ExchangeValue;

/**
 * @author Harish 
 *
 */

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);

}
