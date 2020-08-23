package com.sqad1.productreview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqad1.productreview.constant.AppConstant;
import com.sqad1.productreview.dto.OrderListDto;
import com.sqad1.productreview.dto.OrdersDto;
import com.sqad1.productreview.service.OrdersService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/orders")
@Slf4j
public class OrdersController {
	@Autowired
	OrdersService ordersService;
	
	@GetMapping("/all")
	public ResponseEntity<OrderListDto> getorderlist(){
		log.info("Get the orders  list...");
		  List<OrdersDto> orderDetailsdto = ordersService.getorderDetails();
		OrderListDto orderList = new OrderListDto();
		orderList.setOrdderlist(orderDetailsdto);
		orderList.setMessage(AppConstant.SUCCESS_STATUS_MESSAGE);
		orderList.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<>(orderList, HttpStatus.CREATED);
	}

}
