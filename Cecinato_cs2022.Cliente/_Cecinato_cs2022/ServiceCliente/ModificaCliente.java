package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;

public interface ModificaCliente {
	
	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException;

	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta, ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws ClienteException, DipendenteException;

	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera) throws ClienteException, DipendenteException;

	public boolean modificaNumeroCartaFedelta() throws ClienteException, DipendenteException;

	public boolean modificaCodiceFiscale(String codiceFiscale) throws ClienteException, DipendenteException;
	
	
}
