package org.javabrains;

public class InvalidInputException extends Exception {
	
	private String errorDetails;
	
	public InvalidInputException(String reason, String erroDetails) {
		super(reason);
		this.errorDetails = erroDetails;
	}
	
	public String getDefaultInfo() {
		return errorDetails;
	}
	
	
}
