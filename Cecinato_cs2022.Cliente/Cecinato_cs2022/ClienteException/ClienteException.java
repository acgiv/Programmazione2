package Cecinato_cs2022.ClienteException;

public class ClienteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ClienteException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	public ClienteException(String argv) {
		super(argv);
	}
	
	public String ExceptionMetodo() {
		return getMessage() + "questa funzione non può essere usata per il cliente";
	}
}
