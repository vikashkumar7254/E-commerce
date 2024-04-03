package com.ecom.service;

import com.ecom.dto.SellerDTO;
import com.ecom.dto.SessionDTO;
import com.ecom.model.SellerSession;

public interface LoginLogoutService {

	public void checkTokenStatus(String token);

	public void deleteExpiredTokens();

	public SessionDTO LogoutSeller(SessionDTO session);

	public SellerSession LoginSeller(SellerDTO seller);

}
