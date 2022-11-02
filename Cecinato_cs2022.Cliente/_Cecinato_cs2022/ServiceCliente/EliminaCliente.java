package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

public interface EliminaCliente {
	
	public boolean eliminaNomeCartaFedelta()  throws ClienteException, DipendenteException ;

	public boolean eliminaPuntiAccumulati()  throws ClienteException, DipendenteException ;

	public boolean eliminaDataInscrizioneTessera() throws ClienteException, DipendenteException ;

	public boolean eliminaNumeroCartaFedelta() throws ClienteException, DipendenteException ;

}
