package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.DipendenteException.DipendenteException;

public interface VisualizzaCliente {
	
	public void visualizzaElencoOperazioniPunti() throws DipendenteException;

	public String VisualizzaNomeCartaFedelta() throws DipendenteException;

	public String VisualizzaPuntiFedeltaAccumulati() throws DipendenteException;

	public String VisualizzaDataInscrizioneTessera() throws DipendenteException;

	public String VisualizzaNumeroCartaFedelta() throws DipendenteException;
	
	public String VisualizzaCodiceFiscale() throws DipendenteException;
	
}
