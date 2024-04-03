package com.ecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
	Optional<Seller> findByMobile(String mobile);

}
