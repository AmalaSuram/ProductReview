package com.sqad1.productreview.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqad1.productreview.dto.OrderRequestDto;
import com.sqad1.productreview.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/Products")
@Slf4j
public class ProductController {

	private static Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	
	
	/**
	 * This method is used to buy product
	 * @param orderRequestDto
	 * @return
	 */
	@PostMapping("/buy")
	public ResponseEntity<String> buyProduct(@RequestBody OrderRequestDto orderRequestDto ){
		
		productService.buyProduct(orderRequestDto.getProductId(), orderRequestDto.getUserId(), orderRequestDto.getQuantity());
		logger.info("...Product Buy Successfully");
		
		return new ResponseEntity<>("Product Buy Successfully",HttpStatus.CREATED);
		
		
	}
}
