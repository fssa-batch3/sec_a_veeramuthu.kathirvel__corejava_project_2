package com.fssa.pacapp.validation.exceptions;

public class InvalidPackageException extends Exception {
	private static final long serialVersionUID = -7666342886146253352L;

	public InvalidPackageException(String msg) {
		super(msg);
	}

	public InvalidPackageException(Throwable ex) {
		super(ex);
	}
}
