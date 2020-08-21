package com.sqad1.productreview.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.entity.Orders;
import com.sqad1.productreview.repository.OrdersRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	OrdersRepository orderRepository;
	
	 public Orders saveOrder(OrdersDto orderdto){
			
			Orders order = new Orders();
			BeanUtils.copyProperties(orderdto, order);
			return orderRepository.save(order);
		}
}
