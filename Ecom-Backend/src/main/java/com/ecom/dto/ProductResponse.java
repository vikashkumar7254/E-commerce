package com.ecom.dto;

import com.ecom.dao.ProductDao;
import lombok.Data;
import java.util.List;
@Data
public class ProductResponse {
	private List<ProductDao>content;
	private int pageNo;
	private int pageSize;
	private int totalPages;
	private boolean lastPage;

	

}
