package com.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int orderItemId;
	@OneToOne
	private Product product;
	private double totalProductPrice;
	@ManyToOne
	private Order order;
	private int productQuantity;

	

}
