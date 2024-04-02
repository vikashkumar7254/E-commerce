package com.ecom.dto;

import com.ecom.dao.OrderDao;
import lombok.Data;
import java.util.List;

@Data
public class OrderResponse {
	
	private int pageSize;
	private int pageNo;
	private int totalPage;
	private Long totalElement;
	private List<OrderDao>content;
	private boolean isLastPage;

}
