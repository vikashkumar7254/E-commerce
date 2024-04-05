package com.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dto.SellerDTO;
import com.ecom.dto.SessionDTO;
import com.ecom.exception.LoginException;
import com.ecom.exception.SellerException;
import com.ecom.model.Seller;
import com.ecom.model.SellerSession;
import com.ecom.repository.SellerRepository;
import com.ecom.repository.SessionRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private LoginLogoutService loginLogoutService;

	@Autowired
	private SessionRepository sessionRepository;

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
	public Seller getSellerByMobile(String mobile, String token) throws SellerException {
		if (token.contains("seller") == false) {
			throw new LoginException("Invalid session token for seller");
		}
		loginLogoutService.checkTokenStatus(token);
		Seller existingseller = sellerRepository.findByMobile(mobile)
				.orElseThrow(() -> new SellerException("Seller not found by given number"));
		return existingseller;
	}

	@Override
	public Seller getCurrentlyLoggedInSeller(String token) throws SellerException {
		if (token.contains("seller") == false) {
			throw new LoginException("invalid session token for seller");
		}
		loginLogoutService.checkTokenStatus(token);
		SellerSession seller = sessionRepository.findByToken(token).get();
		Seller existingSeller = sellerRepository.findById(seller.getSellerId())
				.orElseThrow(() -> new SellerException("Seller not found with this ID"));
		return existingSeller;
	}

	@Override
	public Seller updateSellermobile(SellerDTO sellerdto, String token) throws SellerException {
		if (token.contains("Seller") == false) {
			throw new LoginException("invalid session token for seller");
		}
		loginLogoutService.checkTokenStatus(token);

		SellerSession seller = sessionRepository.findByToken(token).get();
		Seller existingSeller = sellerRepository.findById(seller.getSellerId())
				.orElseThrow(() -> new SellerException("Seller not found with this ID" + seller.getSellerId()));
		if (existingSeller.getPassword().equals(sellerdto.getPassword())) {
			existingSeller.setMobile(sellerdto.getMobile());
			return sellerRepository.save(existingSeller);
		} else {
			throw new SellerException("problem during mobile update ");
		}

	}

	@Override
	public Seller deleteSellerbyId(Integer sellerId, String token) throws SellerException {
		if (token.contains("seller") == false) {
			throw new LoginException("Invalid session token for seller");
		}
		loginLogoutService.checkTokenStatus(token);
		Optional<Seller> opt = sellerRepository.findById(sellerId);
		if (opt.isPresent()) {

			SellerSession seller = sessionRepository.findByToken(token).get();
			Seller existingseller = opt.get();
			if (seller.getSellerId() == existingseller.getSellerId()) {

				SessionDTO session = new SessionDTO();
				session.setToken(token);
				loginLogoutService.LogoutSeller(session);

				return existingseller;
			} else {
				throw new SellerException("Verification Error in deleting seller account");
			}
		} else
			throw new SellerException("Seller not found for this ID: " + sellerId);

	}

	@Override
	public SessionDTO updateSellerPassword(SellerDTO sellerdto, String Token) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller updateSeller(Seller seller, String token) throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

}
