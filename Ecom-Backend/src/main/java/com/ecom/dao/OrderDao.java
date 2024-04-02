package com.ecom.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDao {
	
	private int orderId;
	private String orderStatus;
	private String paymentStatus;
	private Date orderDelivered;
	private double orderAmt;
	private String billingAddress;
	private UserDao user;
	private Set<OrderItemDao> orderItem= new HashSet<>();
	private Date orderCreateAt;

	
}
