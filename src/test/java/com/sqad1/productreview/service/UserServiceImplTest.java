package com.sqad1.productreview.service;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;
import static org.junit.Assert.assertTrue;
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

	
	UserRequestDto userdto = new UserRequestDto();
	UserResponseDto userResponseDto=new UserResponseDto();
	@Before
	public void init() {
		
		//userResponseDto.setUserId(1);
		//userResponseDto.setUserId(userId);
	
	}

	@Test
	public void testsaveUser() {
		User user = new User();
		user.setUserId(1);
		user.setAddress("anantapur");
		user.setEmail("amala@gamil.com");
		user.setPhoneNumber(7680920258L);
		user.setUserName("amala");
		userResponseDto.setUserId(1);
		Mockito.when(userRepository.save(user)).thenReturn(user);
		BeanUtils.copyProperties(user, userdto);

		Assert.assertNotNull(userResponseDto);
     
		
			
	}

}
