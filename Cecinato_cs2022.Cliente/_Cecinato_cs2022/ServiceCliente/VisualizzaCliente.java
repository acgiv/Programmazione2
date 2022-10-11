package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface VisualizzaCliente {

	public String VisualizzaNomeCartaFedelta() throws PersonaException;

	public String VisualizzaPuntiFedeltaAccumulati() throws PersonaException;

	public String VisualizzaDataInscrizioneTessera() throws PersonaException;

	public String VisualizzaNumeroCartaFedelta() throws PersonaException;
	
	public String VisualizzaCodiceFiscale() throws PersonaException;
	
}
