package com.sqad1.productreview.service;

import com.sqad1.productreview.dto.UserRequestDto;
import com.sqad1.productreview.dto.UserResponseDto;

public interface UserService {

	UserResponseDto saveUser(UserRequestDto userdto);

}
