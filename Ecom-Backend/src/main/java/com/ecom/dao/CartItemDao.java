package com.ecom.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CartItemDao {
	
	private int cartItemId;
	private int quantity;
	private double totalPrice;
	@JsonIgnore
	private CartDao cart;
	private ProductDao product;
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public CartDao getCart() {
		return cart;
	}
	public void setCart(CartDao cart) {
		this.cart = cart;
	}
	public ProductDao getProduct() {
		return product;
	}
	public void setProduct(ProductDao product) {
		this.product = product;
	}
	
}
