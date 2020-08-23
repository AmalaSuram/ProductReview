package com.sqad1.productreview.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;

import com.sqad1.productreview.dto.UserRequestDto;
import com.sqad1.productreview.dto.UserResponseDto;
import com.sqad1.productreview.entity.User;
import com.sqad1.productreview.repository.UserRepository;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UserServiceImplTest {
	@InjectMocks
	UserServiceImpl userServiceImpl;
	@Mock
	UserRepository userRepository;

	User user = new User();

	UserResponseDto userResponseDto = new UserResponseDto();

	@Before
	public void init() {
		user.setUserId(51784768);
		user.setUserName("amala");
		user.setAddress("anantapur");
		user.setPhoneNumber(7680920258L);
		user.setEmail("amala@gmail.com");

		userResponseDto.setUserId(51784768);

	}

	@Test
	public void testsaveUser() {

		Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(user);
		UserRequestDto userdto = new UserRequestDto();
		BeanUtils.copyProperties(user, userdto);
		UserResponseDto saveUser = userServiceImpl.saveUser(userdto);

	assertEquals(51784768, saveUser.getUserId());
		
	}

}
