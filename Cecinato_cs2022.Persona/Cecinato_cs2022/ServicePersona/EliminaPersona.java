package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface EliminaPersona {

	public boolean eliminaNome() throws PersonaException;

	public boolean eliminaCognome() throws PersonaException;

	public boolean eliminaEta() throws PersonaException;

	public boolean eliminaGenere() throws PersonaException;

	public boolean eliminaDataNascita() throws PersonaException;

	public boolean eliminaCitta() throws PersonaException;

}
