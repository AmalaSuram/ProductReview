package com.sqad1.productreview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String email;
	private String address;
	private Long phoneNumber;
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getEmail()=" + getEmail() + ", getAddress()=" + getAddress() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
