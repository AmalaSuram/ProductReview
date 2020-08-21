package com.sqad1.productreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqad1.productreview.constant.AppConstant;
import com.sqad1.productreview.dto.UserRequestDto;
import com.sqad1.productreview.dto.UserResponseDto;
import com.sqad1.productreview.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	@Autowired
	UserService userService;
	/**
	 * saveUser() is used to create new User
	 * 
	 * @param user is input for the saveUser()
	 * @return it return the UserResponseDto
	 */
	@PostMapping("/createuser")
	public ResponseEntity<UserResponseDto> saveUser(@RequestBody UserRequestDto userdto) {
		//log.info(" Inside the Create the users  based on user input...");
		UserResponseDto userResponse = userService.saveUser(userdto);
		userResponse.setMessage(AppConstant.SUCCESS_STATUS_MESSAGE);
		userResponse.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
	}
}
