package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface EliminaCliente {
	
	public boolean eliminaNomeCartaFedelta() throws PersonaException;

	public boolean eliminaPuntiAccumulati() throws PersonaException;

	public boolean eliminaDataInscrizioneTessera() throws PersonaException;

	public boolean eliminaNumeroCartaFedelta() throws PersonaException;

}
