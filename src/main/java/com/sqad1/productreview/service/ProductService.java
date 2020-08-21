package com.sqad1.productreview.service;

import com.sqad1.productreview.dto.OrdersDto;

public interface ProductService {

	public OrdersDto buyProduct(Integer productId, Integer UserId,Integer quantity);
}
