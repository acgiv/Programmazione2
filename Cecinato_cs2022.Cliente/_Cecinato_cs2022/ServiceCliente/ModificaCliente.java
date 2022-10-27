package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface ModificaCliente {
	
	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws PersonaException;

	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta, ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws PersonaException;

	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera) throws PersonaException;

	public boolean modificaNumeroCartaFedelta() throws PersonaException;

	public boolean modificaCodiceFiscale(String codiceFiscale) throws PersonaException;
	
	
}
