package Cecinato_cs2022.ExceptionPersona;

public class PersonaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PersonaException (String message){
		super(message);
	}

	public PersonaException() {
	}

}
