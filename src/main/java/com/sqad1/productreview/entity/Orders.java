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
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private Integer userId;
	private Integer productId;
	private Double totalPrice;
	private Integer quantity;
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", userId=" + userId + ", productId=" + productId + ", totalPrice="
				+ totalPrice + ", quantity=" + quantity + ", getOrderId()=" + getOrderId() + ", getUserId()="
				+ getUserId() + ", getProductId()=" + getProductId() + ", getTotalPrice()=" + getTotalPrice()
				+ ", getQuantity()=" + getQuantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
