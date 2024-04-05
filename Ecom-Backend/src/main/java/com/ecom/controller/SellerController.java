package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Seller;
import com.ecom.service.SellerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class SellerController {

	@Autowired
	private SellerService sellerService;

	// Add seller------

	@PostMapping("/addseller")

	public ResponseEntity<Seller> addSellerHandler(@RequestBody Seller seller) {
		Seller addseller = sellerService.addSeller(seller);
		System.out.println("Seller" + seller);

		return new ResponseEntity<Seller>(addseller, HttpStatus.CREATED);
	}

}
