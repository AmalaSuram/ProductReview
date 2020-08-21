package com.sqad1.productreview.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.entity.Product;
import com.sqad1.productreview.entity.User;
import com.sqad1.productreview.exception.ProductNotFoundException;
import com.sqad1.productreview.exception.UserNotFoundException;
import com.sqad1.productreview.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	com.sqad1.productreview.repository.UserRepository userRepository;
	
	@Autowired
	OrdersService orderService;
	
	public OrdersDto buyProduct(Integer productId, Integer userId,Integer quantity){
			
			 Optional<Product> product = productRepository.findById(productId);
			 Optional<User> user = userRepository.findById(userId);
			 if(user.isPresent()){
				 if(product.isPresent()){
					 OrdersDto orderdto = new OrdersDto();
					 orderdto.setProductId(productId);
					 orderdto.setQuantity(quantity);
					 orderdto.setUserId(userId);
					 
					double totalAmount = quantity * product.get().getProductPrice()  ;
					System.out.println(totalAmount);
					orderdto.setTotalPrice(totalAmount);
					orderService.saveOrder(orderdto);
					
					return orderdto;
				 }else {
					  throw new ProductNotFoundException(productId);
				 }
			 }else{
				 throw new UserNotFoundException(userId);
			 }
		}
}
