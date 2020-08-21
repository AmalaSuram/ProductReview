package com.sqad1.productreview.service;

import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.entity.Orders;

public interface OrdersService {

	
	public Orders saveOrder(OrdersDto orderdto);
}
