package com.sqad1.productreview.dto;

import java.util.List;


public class OrderListDto {
	private List<OrdersDto> ordderlist;
	private Integer statusCode;
	private String message;
	public List<OrdersDto> getOrdderlist() {
		return ordderlist;
	}
	public void setOrdderlist(List<OrdersDto> ordderlist) {
		this.ordderlist = ordderlist;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
