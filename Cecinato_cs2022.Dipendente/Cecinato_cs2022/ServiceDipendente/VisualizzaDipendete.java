package Cecinato_cs2022.ServiceDipendente;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface VisualizzaDipendete {
	
	public void VisualizzaElencoTipologiaContratto() throws PersonaException;
	
	public  String visualizzaCodiceIdentificativoDipendete() throws PersonaException;
	
	public  String visualizzaNomeAziendaDipendente() throws PersonaException;

	public  String visualizzaEmailAziendaleDipendente() throws PersonaException;

	public  String visualizzaNumeroTelefonoAziendaleDipendente() throws PersonaException;

	public  ConstantGlobal.TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws PersonaException;
	
	public  String visualizzaRuoloDipendente() throws PersonaException;

}
