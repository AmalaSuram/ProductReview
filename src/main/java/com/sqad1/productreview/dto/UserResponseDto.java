package com.sqad1.productreview.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
	private Integer userId;
	private Integer statusCode;
	private String message;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
