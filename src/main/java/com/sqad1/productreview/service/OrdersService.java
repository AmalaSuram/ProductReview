package com.sqad1.productreview.service;

import java.util.List;

import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.entity.Orders;

public interface OrdersService {

	List<OrdersDto>  getorderDetails();

	public Orders saveOrder(OrdersDto orderdto);
}
