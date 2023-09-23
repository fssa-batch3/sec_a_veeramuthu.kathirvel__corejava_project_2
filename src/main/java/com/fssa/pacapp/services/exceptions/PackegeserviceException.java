 package com.fssa.pacapp.services.exceptions;

public class PackegeserviceException extends Exception   {
	
	private static final long serialVersionUID = -3252845835071851134L;

	public  PackegeserviceException(String msg) {
		super(msg);
	} 

	public  PackegeserviceException(Throwable ex) {
		super(ex);
	}

}
