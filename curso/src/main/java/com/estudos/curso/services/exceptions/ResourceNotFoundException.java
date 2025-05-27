package com.estudos.curso.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	public ResourceNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	

}
