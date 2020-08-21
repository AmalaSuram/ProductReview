package com.sqad1.productreview.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.sqad1.productreview.dto.UserRequestDto;
import com.sqad1.productreview.dto.UserResponseDto;
import com.sqad1.productreview.entity.User;
import com.sqad1.productreview.service.UserService;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UserControllerTest {
	@InjectMocks
	UserController userController;
	@Mock
	UserService userService;
	
	UserRequestDto userdto=new UserRequestDto();
	UserResponseDto userResponseDto=new UserResponseDto();
	User user=new User();
	
	@Before
	public void init() {
		userdto.setAddress("anantapur");
		userdto.setEmail("amala@gamil.com");
		userdto.setPhoneNumber(7680920258L);
		userdto.setUserName("amala");
		
		userResponseDto.setStatusCode(200);
	}
	
	@Test
	public void testsaveUser() {

		Mockito.when(userService.saveUser(userdto)).thenReturn(userResponseDto);

	 ResponseEntity<UserResponseDto> saveUser = userController.saveUser(userdto);

		assertEquals(200, saveUser.getBody().getStatusCode());

	}

}
