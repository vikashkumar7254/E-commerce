package com.ecom.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDao {
	private int orderItemId;
	private ProductDao product;
	private double totalProductPrice;
	@JsonIgnore
	private OrderDao order;
	private int productQuantity;

}
