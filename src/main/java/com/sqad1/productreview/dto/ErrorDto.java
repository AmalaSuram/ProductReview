package com.sqad1.productreview.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDto {

	private Integer errorStatusCode;
	private String errorStatusMessage;
	public Integer getErrorStatusCode() {
		return errorStatusCode;
	}
	public void setErrorStatusCode(Integer errorStatusCode) {
		this.errorStatusCode = errorStatusCode;
	}
	public String getErrorStatusMessage() {
		return errorStatusMessage;
	}
	public void setErrorStatusMessage(String errorStatusMessage) {
		this.errorStatusMessage = errorStatusMessage;
	}

	
}
