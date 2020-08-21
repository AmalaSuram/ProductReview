package com.sqad1.productreview.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqad1.productreview.dto.UserRequestDto;
import com.sqad1.productreview.dto.UserResponseDto;
import com.sqad1.productreview.entity.User;
import com.sqad1.productreview.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserResponseDto saveUser(UserRequestDto userdto) {
		User user=new User();
		BeanUtils.copyProperties(userdto, user);
		   User saveUser = userRepository.save(user);
			UserResponseDto userResponseDto=new UserResponseDto();
			userResponseDto.setUserId(saveUser.getUserId());
			return userResponseDto;
	}


}
