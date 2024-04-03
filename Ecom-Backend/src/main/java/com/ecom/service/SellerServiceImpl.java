package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dto.SellerDTO;
import com.ecom.exception.SellerException;
import com.ecom.model.Seller;
import com.ecom.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	@Override
	public Seller addSeller(Seller seller) {

		Seller add = sellerRepository.save(seller);
		return add;

	}

	@Override
	public List<Seller> getAllSellers() throws SellerException {

		List<Seller> sellers = sellerRepository.findAll();

		if (sellers.size() > 0) {
			return sellers;
		} else
			throw new SellerException("No Seller Found !");

	}

	@Override
	public Seller getSellerById(Integer sellerId) throws SellerException {

		Optional<Seller> seller = sellerRepository.findById(sellerId);
		if (seller.isPresent()) {
			return seller.get();
		} else
			throw new SellerException("Seller not found exception " + sellerId);
	}

	@Override
	public Seller getSellerByMobile(String mobile, String Token) throws SellerException {
		if(Token.contains("seller")) {
			
		}
		
		
		return null;
	}

	@Override
	public Seller getCurrentlyLoggedInSeller(String token) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller updateSellermobile(SellerDTO sellerdto, String token) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller deleteSellerbyId(Integer sellerId, String token) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

}
