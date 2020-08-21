package com.sqad1.productreview.exception;
/**
 * 
 * @author shraddha
 *
 */
public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(Integer productName) {
		super(String.format("Product "+productName+" not found"));
	}
}
