package com.ecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.SellerSession;

public interface SessionRepository extends JpaRepository<SellerSession, Integer> {

	Optional<SellerSession>findByToken(String token);
	
	Optional<SellerSession>findBySellerId(Integer SellerID);
   
}
