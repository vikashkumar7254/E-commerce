package com.ecom.dao;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDao {
	private int productId;
	private String product_name;
	private double product_prize; 
	private boolean stock=true;
	private int product_quantity;
	private boolean live;
	private String product_imageName;
	private String product_desc;
	private CategoryDao categories;


}
