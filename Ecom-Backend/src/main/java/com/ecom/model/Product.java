package com.ecom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productId")
	private int productId;
	private String product_name;
	private double product_prize; 
	private boolean stock;
	private int product_quantity;
	private boolean live;
	@Lob
	private byte[] product_imageName;
	private String product_desc;
	@ManyToOne(fetch= FetchType.EAGER)
	private Categories categories;

	
	

}
