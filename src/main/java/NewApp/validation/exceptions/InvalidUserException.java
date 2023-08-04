package NewApp.validation.exceptions;

public class InvalidUserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7666342886146253352L;

	public InvalidUserException(String msg) {
		super(msg);
	}

	public InvalidUserException(Throwable ex) {
		super(ex);
	}
}
