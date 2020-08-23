package com.sqad1.productreview.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqad1.productreview.dto.OrderListDto;
import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.entity.Orders;
import com.sqad1.productreview.repository.OrdersRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	OrdersRepository ordersRepository;
	
	@Override
	public List<OrdersDto>  getorderDetails() {
		List<Orders> orders = ordersRepository.findAll();
		//List<OrdersDto> ordersdto=new ArrayList<>();
		
		List<OrdersDto> collect = orders.stream().map(o->convertDto(o)).collect(Collectors.toList());
//		//List<OrdersDto> ordersDtolist=new ArrayList<OrdersDto>();
//		OrderListDto orderListDto=new OrderListDto();
//		
//		List<OrdersDto> ordersDtolist=new ArrayList<OrdersDto>();
////		
//		orders.stream().forEach(o->{
//			
//			OrdersDto ordersDto=new OrdersDto();
//			BeanUtils.copyProperties(o, ordersDto);
//			ordersdto.add(ordersDto);
//			
//			
//		});
		return collect;
	}
	
	
	private OrdersDto convertDto(Orders order1) {
		OrdersDto ordersDto=new OrdersDto();
		BeanUtils.copyProperties(order1, ordersDto);
		return ordersDto;
		
	}

}
