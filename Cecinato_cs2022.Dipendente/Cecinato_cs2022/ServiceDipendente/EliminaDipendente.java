package Cecinato_cs2022.ServiceDipendente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

public interface EliminaDipendente {

	public boolean eliminaNomeAzienda() throws DipendenteException, ClienteException;

	public boolean eliminaEmailAziendale() throws DipendenteException, ClienteException;

	public boolean eliminaNumeroTelefonoAziendale() throws DipendenteException, ClienteException;

	public boolean eliminatipologiaContratto() throws DipendenteException, ClienteException;

	public boolean eliminaRuolo() throws DipendenteException, ClienteException;
}
