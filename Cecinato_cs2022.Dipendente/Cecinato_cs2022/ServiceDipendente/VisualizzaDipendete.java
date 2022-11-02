package Cecinato_cs2022.ServiceDipendente;

import java.util.Set;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.Dipendente.Riparazione;
import Cecinato_cs2022.Dipendente.Vendita;

public interface VisualizzaDipendete {
	
	public void VisualizzaElencoTipologiaContratto() throws ClienteException;
	
	public  String visualizzaCodiceIdentificativoDipendete() throws ClienteException;
	
	public  String visualizzaNomeAziendaDipendente() throws ClienteException;

	public  String visualizzaEmailAziendaleDipendente() throws ClienteException;

	public  String visualizzaNumeroTelefonoAziendaleDipendente() throws ClienteException;

	public  ConstantGlobal.TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws ClienteException;
	
	public  String visualizzaRuoloDipendente() throws ClienteException;
	
	public Set<Riparazione> visualizzaElencoTvRiparate() throws ClienteException;
	
	public Set<Vendita> visualizzaElencoTvVendute() throws ClienteException;

}
