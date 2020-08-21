package com.sqad1.productreview.service;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.entity.Orders;
import com.sqad1.productreview.entity.Product;
import com.sqad1.productreview.entity.User;
import com.sqad1.productreview.repository.ProductRepository;
import com.sqad1.productreview.repository.UserRepository;

@RunWith(MockitoJUnitRunner.Silent.class)
public class ProductServiceImplTest {

	@InjectMocks
	ProductServiceImpl productService;
	
	@Mock
	ProductRepository productRepository;
	
	@Mock
	OrdersService orderService;
	
	@Mock
	UserRepository userRepository;
	
	@Test
	public void TestbuyProduct(){
		
		Product product = new Product();
		product.setProductId(1);
		product.setProductName("TV");
		product.setProductPrice(new Double("700"));
		Mockito.when(productRepository.findById(1)).thenReturn(Optional.of(product));
		
		User user = new User();
		user.setUserId(1);
		user.setUserName("Mona");
		user.setAddress("Pune");
		Mockito.when(userRepository.findById(1)).thenReturn(Optional.of(user));
		
		OrdersDto orderdto = new OrdersDto();
		orderdto.setProductId(1);
		orderdto.setQuantity(4);
		orderdto.setUserId(1);
		
		Orders orders = new Orders();
		Mockito.when(orderService.saveOrder(orderdto)).thenReturn(orders);
		
		OrdersDto ordersDto = productService.buyProduct(1, 1, 4);
		
		Assert.assertNotNull(ordersDto);
		 //Assert.assertEquals(4, ordersDto.getQuantity());
	}
}
