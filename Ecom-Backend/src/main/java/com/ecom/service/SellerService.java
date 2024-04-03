package com.ecom.service;

import java.util.List;

import com.ecom.dto.SellerDTO;
import com.ecom.dto.SessionDTO;
import com.ecom.exception.SellerException;
import com.ecom.model.Seller;

public interface SellerService {

	public Seller addSeller(Seller seller);

	public List<Seller> getAllSellers() throws SellerException;

	public Seller getSellerById(Integer sellerId) throws SellerException;

	public Seller getSellerByMobile(String mobile, String Token) throws SellerException;

	public Seller getCurrentlyLoggedInSeller(String token) throws SellerException;

	public SessionDTO updateSellerPassword(SellerDTO sellerdto, String Token) throws SellerException;

	public Seller updateSeller(Seller seller, String token) throws SellerException;

	public Seller updateSellermobile(SellerDTO sellerdto, String token) throws SellerException;

	public Seller deleteSellerbyId(Integer sellerId, String token) throws SellerException;

}
