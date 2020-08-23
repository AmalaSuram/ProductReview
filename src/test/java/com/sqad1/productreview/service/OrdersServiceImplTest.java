package com.sqad1.productreview.service;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.entity.Orders;
import com.sqad1.productreview.repository.OrdersRepository;

@RunWith(MockitoJUnitRunner.Silent.class)
public class OrdersServiceImplTest {
	@InjectMocks
	OrdersServiceImpl ordersServiceImpl;
	@Mock
	OrdersRepository ordersRepository;
	List<Orders> orders =new ArrayList<Orders>();
	Orders ordersentity=new Orders();
	
	List<OrdersDto> ordersdto=new ArrayList<>();
	OrdersDto ordersDto=new OrdersDto();
	@Before
	public void init() {
		ordersentity.setOrderId(1);
		orders.add(ordersentity);
		ordersDto.setOrderId(1);
		ordersdto.add(ordersDto);
	}
	
	
	@Test
	public void getorderDetails() {
		
		Mockito.when(ordersRepository.findAll()).thenReturn(orders);
		List<OrdersDto> getorderDetails = ordersServiceImpl.getorderDetails();
		
		assertEquals(1, getorderDetails.size());
		
	}

}
