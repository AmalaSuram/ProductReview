package com.sqad1.productreview.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;

import com.sqad1.productreview.dto.OrderListDto;
import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.service.OrdersService;

@RunWith(MockitoJUnitRunner.Silent.class)
public class OrdersControllerTest {
	@InjectMocks
	OrdersController ordersController;
	@Mock
	OrdersService ordersService;
	List<OrdersDto> orderdtolist=new ArrayList<OrdersDto>();
	OrdersDto OrdersDto=new OrdersDto();
	@Before
	public void init() {
		OrdersDto.setOrderId(1);
		orderdtolist.add(OrdersDto);
	}
	
	@Test
	public void testgetorderlist() {
		Mockito.when(ordersService.getorderDetails()).thenReturn(orderdtolist);
		
		ResponseEntity<OrderListDto> getorderlist = ordersController.getorderlist();
		
		assertEquals(200, getorderlist.getBody().getStatusCode());
	}

}
