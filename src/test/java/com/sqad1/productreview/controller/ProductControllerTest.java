package com.sqad1.productreview.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.sqad1.productreview.dto.OrderRequestDto;
import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.service.ProductService;


@RunWith(MockitoJUnitRunner.Silent.class)
public class ProductControllerTest {

	@InjectMocks
	ProductController productController;
	
	@Mock
	ProductService productService;
	
	
	@Test
	public void testbuyProduct(){
		
		OrdersDto order = new OrdersDto();
		order.setProductId(1);
		order.setQuantity(2);
		order.setUserId(1);
		Mockito.when(productService.buyProduct(1, 1, 2)).thenReturn(order);
		
		OrderRequestDto orderReqDto = new OrderRequestDto();
		orderReqDto.setProductId(1);
		orderReqDto.setUserId(1);
		orderReqDto.setQuantity(2);
		ResponseEntity<String> responseEntity = productController.buyProduct(orderReqDto);
		Assert.assertNotNull(responseEntity);
		Assert.assertEquals("Product Buy Successfully",responseEntity.getBody() );
	}
	
}
