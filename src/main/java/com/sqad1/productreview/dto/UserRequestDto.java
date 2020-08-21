package com.sqad1.productreview.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
	private String userName;
	private String email;
	private String address;
	private Long phoneNumber;
}
