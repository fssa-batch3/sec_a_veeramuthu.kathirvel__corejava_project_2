package com.fssa.pacapp.services.exceptions;

public class ServiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3252845835071851134L;

	public ServiceException(String e) {
		super(e);
	}

	public ServiceException(Throwable ex) {
		super(ex);
	}
}
