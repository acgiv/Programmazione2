package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;


public interface AcquisizioneCliente {

	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException;

	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws ClienteException, DipendenteException;

	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera) throws ClienteException, DipendenteException;

	public boolean  addNumeroCartaFedelta() throws ClienteException, DipendenteException;
}
